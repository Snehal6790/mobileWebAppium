# mobileWebAppium

# Java Install
  # For Mac users 
      1.Go To Terminal and type ("java -version")
        The output should Look like this :- ```
        java version "1.8.0_161"
        Java(TM) SE Runtime Environment (build 1.8.0_161-b12)
        Java HotSpot(TM) 64-Bit Server VM (build 25.161-b12, mixed mode)```

  # For Windows Users
      1. GO to command prompt and type("java -version")
        The output should Look like this :- ```
        java version "1.8.0_161"
        Java(TM) SE Runtime Environment (build 1.8.0_161-b12)
        Java HotSpot(TM) 64-Bit Server VM (build 25.161-b12, mixed mode)```
        
 # Install Appium GUI 
      # Appium Installation on Windows
 ## Download the following before you start the installation process-
    [Android Studio][http://developer.android.com/sdk/installing/index.html]
    [Appium Jar files for Java][https://search.maven.org/search?q=g:io.appium%20AND%20a:java-client]
    [Latest Appium Client Library][https://docs.seleniumhq.org/download/]
    Appium Server[https://appium.io/]
    Java[https://www.oracle.com/technetwork/java/javase/downloads/index.html]
 Install Java on your system. Don’t forget to set the environment variables!
 Install Android Studio on your system by running the installer and then create a new project.       
 
 # Appium Installation on MAC
   1. java -version
   2. vim ~/.bash_profile . This will open up a vim-editor. Press I to enter into insert mode and enter the following code.

                                   ``` export JAVA_HOME = $(/usr/libexec/java_home)
                                    export PATH = $JAVA_HOME/bin=$PATH
                                    export PATH = /usr/local/bin:PATH```
   3. Now, it’s time to install Xcode from the app store. Just search for Xcode on the app store and hit the install button.
   4.After you have installed Xcode, its time to install homebrew on your system. Copy the code below and paste it into your              terminal.
          /usr/bin/ruby -e "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/master/install)"
   5.After the above code has run completely run the following commands.
       ``` brew update
        brew doctor
        xcode-select --install```
# [Install Intellij][https://www.jetbrains.com/idea/download/#section=mac]
        
        
       


