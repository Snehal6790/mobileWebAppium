package coremodles;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import mobiledriver.BaseClass;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class DriverManagers extends BaseClass {

    private static String nodeJS = "/usr/local/bin/node";
    private static String appiumJS = "/Applications/Appium.app/Contents/Resources/app/node_modules/appium/build/lib/main.js";

    private  AppiumDriverLocalService service;
    static AppiumDriver<MobileElement> driver = null;
    static DesiredCapabilities caps;


    public DesiredCapabilities getcaps() throws MalformedURLException {
    caps = new DesiredCapabilities();
    caps.setCapability("deviceName", BaseClass.prop.getProperty("deviceName"));
    caps.setCapability("platformName", BaseClass.prop.getProperty("platformName"));
    caps.setCapability("platformVersion", BaseClass.prop.getProperty("platformVersion"));
    caps.setCapability("browserName", "Chrome");
    caps.setCapability("automationName",BaseClass.prop.getProperty("automationName"));
    driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    return caps ;
}

    public void AppiumStartServer() throws MalformedURLException {

        AppiumServiceBuilder builder = new AppiumServiceBuilder();

        builder
                .withAppiumJS(new File(appiumJS))
                .usingDriverExecutable(new File(nodeJS))
                .withLogFile(new File("AppiumLogFile.txt"));

        service = builder.build();
        service.start();

        System.out.println(service.getUrl().toString());
        builder.withCapabilities(getcaps());
        Assert.assertNotNull(driver);
        driver.get(BaseClass.prop.getProperty("baseurl"));
    }

    public void stopserver(){
        service.stop();
        System.out.println("Appium Server has been stopped");
    }


}
