import coretest.BaseClass;
import mobileViewPages.ErrorMessagePage;
import mobileViewPages.HomePage;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.net.MalformedURLException;
import java.nio.charset.MalformedInputException;

import static coremodles.DriverManagers.AppiumStartServer;
import static utils.Utils.scroll;
import static utils.Utils.waitforelement;

public class BvAnalysis extends BaseClass {

    HomePage homePage;
    ErrorMessagePage errorMessagePage;
    SoftAssert softAssertion = new SoftAssert();

    public BvAnalysis() {
        super();
    }

    @BeforeClass
    public void setup() throws MalformedURLException {
        AppiumStartServer();
        homePage = new HomePage();
        errorMessagePage = new ErrorMessagePage();
    }

    @Test
    public void testinvaliddata() throws MalformedInputException {
        waitforelement(5);
        homePage.tapContinueWithEmailButton();
        homePage.tapinputEmailId();
        homePage.InputEmailId().clear();
        homePage.InputEmailId().sendKeys("@,@,@,@,!23@@@.com");
        homePage.tapcontinueButton();
        errorMessagePage.EmailValidation();
        homePage.taploginbutton();
        driver.navigate().back();
        homePage.tapContinueWithEmailButton();
        homePage.tapinputEmailId();
        homePage.tapcontinueButton();
    }

    @Test
    public void testautocomplete() throws MalformedInputException {
        waitforelement(5);
        homePage.tapContinueWithEmailButton();
        homePage.tapinputEmailId();
        homePage.tapcontinueButton();
        homePage.tapselectastatedrop("Alabama");
        homePage.tapcityinput();
        homePage.CityInput().clear();
        homePage.CityInput().sendKeys("Man");
        driver.findElement(By.xpath("//div[@class='result'][contains(.,'CHAPMAN')]")).click();
        homePage.CityInput().clear();
        errorMessagePage.CityValidation();
        homePage.CityInput().sendKeys("Man");
        driver.findElement(By.xpath("//div[@class='result'][contains(.,'CHAPMAN')]")).click();
    }


    @Test
    public void testhomebuy() throws MalformedInputException {
        waitforelement(5);
        homePage.tapContinueWithEmailButton();
        homePage.tapinputEmailId();
        homePage.tapcontinueButton();
        homePage.tapselectastatedrop("Alabama");
        homePage.tapcityinput();
        scroll(3);
        homePage.tapBuyhomemonthyyyy();
        homePage.BuyHomePlan().clear();
        homePage.BuyHomePlan().sendKeys("000");
        scroll(5);
        homePage.tapGetMyPlanButton();
        String actualnow = homePage.BuyHomePlan().getText();
        System.out.println(homePage.BuyHomePlan().getText());

        if (actualnow != null) {
            softAssertion.assertEquals(actualnow, "011900");
            softAssertion.assertTrue(true);
        } else {
            System.out.println("Validation didn't run");
        }
        homePage.BuyHomePlan().clear();
        homePage.BuyHomePlan().sendKeys("Pefin");
        String actual = homePage.BuyHomePlan().getText();
        System.out.println(homePage.BuyHomePlan().getText());
        if (actual != null) {
            softAssertion.assertEquals(actual, " ");
            softAssertion.assertTrue(true);
        } else {
            System.out.println("Validation didn't run");
        }
        scroll(4);
        homePage.tapGetMyPlanButton();
        errorMessagePage.HomeValidationdate();
    }


}
