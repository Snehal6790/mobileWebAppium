import coretest.BaseClass;
import mobileViewPages.HomePage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.nio.charset.MalformedInputException;

import static coremodles.DriverManagers.AppiumStartServer;
import static coremodles.DriverManagers.stopserver;
import static utils.Utils.waitforelement;

public class BaseHappyTest extends BaseClass{

    HomePage homePage;

    public BaseHappyTest(){
        super();
    }

    @BeforeClass
    public void setup() throws MalformedURLException {
        AppiumStartServer();
        homePage  = new HomePage();
    }


    @Test
    public void test() throws MalformedInputException {
       waitforelement(5);
        homePage.tapContinueWithEmailButton();
        homePage.tapinputEmailId();
        homePage.tapcontinueButton();
        homePage.tapselectastatedrop("Alabama");
        homePage.tapcityinput();
        homePage.tapBuyhomemonthyyyy();
        homePage.tapcreditscroe();
        homePage.tapupfrontamountinput();
        homePage.tapmonyhlyspending();
        homePage.tapGetMyPlanButton();

    }


    @AfterTest(alwaysRun = true)
    public void tearup(){
        stopserver();

    }


}