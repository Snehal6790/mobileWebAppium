package mobileViewPages;

import coretest.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;
import utils.Utils;

import java.nio.charset.MalformedInputException;

import static utils.Utils.*;


public class HomePage extends BaseClass {

    public HomePage(){
        PageFactory.initElements(driver,this);

    }

    Utils utils = new Utils();

    @FindBy(how = How.XPATH,
            using = "//input[@value='Continue With Email']")
     WebElement continuewithemailButton ;


    @FindBy(how = How.XPATH ,
            using = "//input[@placeholder='What’s your email?']")
     WebElement inputEmailId ;

    @FindBy(how = How.XPATH,
            using = "//input[@value='Continue']")
     WebElement continueButton ;


    @FindBy(how = How.XPATH,
            using = "//a[contains(@class,'login-link')]")
     WebElement loginbutton  ;

    @FindBy(how = How.XPATH,
            using = "//android.widget.Spinner[@text='Select a state']")
     WebElement selectastatedrop ;

    @FindBy(how = How.XPATH,
            using = "//input[contains(@id,'home-input-city-select')]")
     WebElement cityinput ;

    @FindBy(how = How.XPATH,
            using = "//input[contains(@placeholder,'MM / YYYY')]")
    WebElement buyhomemonthyyyy;

    @FindBy(how = How.XPATH,
            using = "//span[contains(.,'Excellent: 750+')]")
    static
    WebElement excellentcreditscore ;

    @FindBy(how = How.XPATH,
            using = "//span[contains(.,'Good: 700–749')]")
    static
    WebElement goodcreditscore ;

    @FindBy(how = How.XPATH,
            using = "//span[contains(.,'Fair: 650–699')]")
    static
    WebElement faircreditscore ;

    @FindBy(how = How.XPATH,
            using = "//span[contains(.,'Poor: 600–649')]")
    static
    WebElement poorcreditscore ;

    @FindBy(how = How.XPATH,
            using = "//span[contains(.,'Bad: Below 600')]")
    static
    WebElement badcreditscore  ;

    @FindBy(how = How.XPATH,
            using = "(//input[@class='input'])[2]")
    static WebElement upfrontamountinput ;

    @FindBy(how = How.XPATH,
            using = "(//input[@class='input'])[3]")
    static WebElement monyhlyspending ;

    @FindBy(how = How.XPATH,
            using = "//input[@value='Get My Plan']")
    static WebElement getmyplanbutton ;

    @FindBy(how = How.XPATH,
            using = "//div[@class='edit-button']")
    WebElement editbutton;

    @FindBy(how = How.XPATH,
            using = "//a[contains(.,'Get Started')]")
    WebElement getstartedbutton;





// Only Tap action on the buttons or element

    public void tapContinueWithEmailButton(){
        waitforelement(3);
        continuewithemailButton.click();
        String s = continuewithemailButton.getText();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(BaseClass.prop.getProperty("emailHometext"),s);
        waitforelement(3);

    }


    public void tapinputEmailId(){
        waitforelement(3);
        inputEmailId.click();
        inputEmailId.sendKeys(utils.emailid());
        waitforelement(3);
        driver.hideKeyboard();

    }

    public void tapcontinueButton (){
        waitforelement(3);
        continueButton.click();
        waitforelement(3);

    }

    public void taploginbutton (){
        waitforelement(3);
        loginbutton.click();

    }


    public void tapselectastatedrop (String cityName){
        waitforelement(10);
        Select dropdown = new Select(driver.findElement(By.id("home-input-state-select")));
        dropdown.selectByVisibleText(cityName);
        sync(2);

    }




    public void tapcityinput () throws MalformedInputException{
        waitforelement(3);
        cityinput.click();
        cityinput.sendKeys("ALABASTER");
        driver.hideKeyboard();
        waitforelement(3);
        scroll(2);

    }

    public void tapBuyhomemonthyyyy(){
        waitforelement(2);
        buyhomemonthyyyy.click();
        buyhomemonthyyyy.sendKeys("122022");
        driver.hideKeyboard();
        scroll(2);
    }

    public void tapcreditscroe (){
        waitforelement(3);
        randomcreditscore().click();
        waitforelement(3);
        scroll(2);
        driver.hideKeyboard();

    }

    public void tapupfrontamountinput (){
        waitforelement(3);
        upfrontamountinput.click();
        upfrontamountinput.sendKeys(String.valueOf(getRandomIntegerBetweenRange(1,10)));
        scroll(2);
        driver.hideKeyboard();

    }

    public void tapmonyhlyspending (){
        waitforelement(3);
        monyhlyspending.click();
        monyhlyspending.sendKeys(String.valueOf(getRandomIntegerBetweenRange(1,10)));
        scroll(2);
        driver.hideKeyboard();

    }

    public void tapGetMyPlanButton (){
        waitforelement(3);
        getmyplanbutton.click();
        waitforelement(3);

    }

    public void tapEdit(){
        waitforelement(2);
        editbutton.click();
    }

    public void tapgetstartedbutton (){
        waitforelement(3);
        scroll(3);
        getstartedbutton.click();

    }


// Making Webelement public for random choosing plans


    public static WebElement Excellentcreditscore() {
        return excellentcreditscore;
    }

    public static WebElement Goodcreditscore(){
        return goodcreditscore;
    }

    public static WebElement Faircreditscore() {
        return faircreditscore;
    }

    public static WebElement Poorcreditscore(){
        return poorcreditscore;
    }

    public static WebElement Badcreditscore() {
        return badcreditscore;
    }

    public  WebElement InputEmailId(){
        return inputEmailId;
    }
    public  WebElement CityInput() {
        return cityinput ;

    }

    public WebElement BuyHomePlan() {
        return buyhomemonthyyyy ;
    }
}
