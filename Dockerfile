FROM furlenco/base_java:latest

MAINTAINER snehal@furlenco.com

WORKDIR /mobileWebAppium


ADD pom.xml /mobileWebAppium/pom.xml
ADD src /mobileWebAppium/src
ADD testng.xml /mobileWebAppium/src/main/resources/testng.xml
#ADD xpanentoken.text /mobileWebAppium/xpanentoken.text
#ADD UserID.text /mobileWebAppium/UserID.text


ENV PYTHONIOENCODING UTF-8

# Adding source, compile and package into a fat jar
RUN ["mvn", "-s", "pom.xml", "clean", "package"]
RUN ["mvn" ,"clean","test","-Dtest=CIA,KYC"]


EXPOSE 5000

ENV PORT 5000

CMD []
