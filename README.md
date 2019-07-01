# MobileWebAppium

# After All set UP . PLease DO RUN THESE COMMAND
                      ```
                      adb -s uninstall io.appium.settings
                      adb -s uninstall io.appium.unlock
                      adb -s uninstall io.appium.uiautomator2
                      adb -s uninstall io.appium.uiautomator2.server.test```
Whenever appium starts to create session it will re-install/install below apps on to the device.

                      io.appium.settings
                      io.appium.unlock
                      io.appium.uiautomator2
                      io.appium.uiautomator2.server.test




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
    [Android Studio] (http://developer.android.com/sdk/installing/index.html)
    [Appium Jar files for Java] (https://search.maven.org/search?q=g:io.appium%20AND%20a:java-client)
    [Latest Appium Client Library] (https://docs.seleniumhq.org/download/)
    Appium Server (https://appium.io/)
    Java (https://www.oracle.com/technetwork/java/javase/downloads/index.html)
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
         ``` /usr/bin/ruby -e "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/master/install)"```
          
   5.After the above code has run completely run the following commands.
                                   ``` 
                                    brew update
                                    brew doctor
                                    xcode-select --install
                                    ```
# [Install Intellij] (https://www.jetbrains.com/idea/download/#section=mac]



# Running Test Scripts 

        1.Go to terminal and type 
                adb devices
          Which lists number of device . Since the project only cover single device copy device id and paste on                         `config.properties` file under `deviceName`
        2. Android device : Go to setting menu ----> System menu option ----> Tap 10 times `About phone` and ----> Check for `Android Version` and value to be paste on same config file under `platformVersion` then just tap on `Build number` option  enable `Developer option` ---> `toggle Use debugging` option for running scripts.
        
        
       


