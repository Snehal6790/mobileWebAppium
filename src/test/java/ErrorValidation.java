import coretest.BaseClass;
import mobileViewPages.ErrorMessagePage;
import mobileViewPages.HomePage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.nio.charset.MalformedInputException;

import static coremodles.DriverManagers.AppiumStartServer;
import static utils.Utils.scroll;
import static utils.Utils.waitforelement;

public class ErrorValidation extends BaseClass{


    HomePage homePage;
    ErrorMessagePage errorMessagePage ;

    public ErrorValidation(){
        super();
    }

    @BeforeClass
    public void setup() throws MalformedURLException {
        AppiumStartServer();
        homePage  = new HomePage();
        errorMessagePage = new ErrorMessagePage();
    }

    @Test
    public void testerrormessage () throws MalformedInputException {
        waitforelement(5);
        homePage.tapContinueWithEmailButton();
        homePage.tapcontinueButton();
        errorMessagePage.EmailValidation();
        homePage.tapinputEmailId();
        homePage.tapcontinueButton();
        scroll(5);
        homePage.tapGetMyPlanButton();
        errorMessagePage.StateValidation();
        homePage.tapselectastatedrop("Alabama");
        errorMessagePage.CityValidation();
        homePage.tapcityinput();
        scroll(2);
        errorMessagePage.HomeValidationdate();
        homePage.tapBuyhomemonthyyyy();
        scroll(4);
        homePage.tapcreditscroe();
        errorMessagePage.UpfrontValidation();
        homePage.tapupfrontamountinput();
        errorMessagePage.MonthlyValidation();
        homePage.tapmonyhlyspending();

        homePage.tapGetMyPlanButton();

    }
}
