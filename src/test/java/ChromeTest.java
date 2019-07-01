import coremodles.DriverManagers;
import mobileViewPages.homepage.HomePage;
import mobiledriver.BaseClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utils.Utils;

import java.net.MalformedURLException;
import java.nio.charset.MalformedInputException;

public class ChromeTest extends BaseClass {

    DriverManagers driverManagers = new DriverManagers();
    HomePage homePage ;
    Utils utils;

    public ChromeTest(){
        super();
    }

    @BeforeClass
    public void setup() throws MalformedURLException {
        driverManagers.AppiumStartServer();
        homePage = new HomePage();
        utils = new Utils();


    }


    @Test
    public void test() throws MalformedInputException {

        homePage.tapContinueWithEmailButton();
        homePage.tapinputEmailId();
        homePage.tapcontinueButton();
        homePage.tapselectastatedrop();
        homePage.tapcityinput();
        homePage.tapcreditscroe();
        homePage.tapupfrontamountinput();
        homePage.tapmonyhlyspending();
        homePage.tapGetMyPlanButton();

    }


    @AfterTest(alwaysRun = true)
    public void tearup(){
        driverManagers.stopserver();

    }


}