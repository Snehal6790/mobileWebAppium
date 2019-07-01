package mobileViewPages;

import io.appium.java_client.MobileElement;
import mobiledriver.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.Utils;

import java.nio.charset.MalformedInputException;
import java.util.List;

import static utils.Utils.waitforelement;

public class HomePage extends BaseClass {

    Utils utils = new Utils();

    public HomePage(){

        PageFactory.initElements(driver,this);
    }




    @FindBy(how = How.XPATH,
            using = "//android.widget.Button[@text='Continue With Email']")
    WebElement continuewithemailButton ;


    @FindBy(how = How.ID,
            using = "email-signup-email-input")
    WebElement inputEmailId ;

    @FindBy(how = How.XPATH,
            using = "//android.widget.Button[@text='Continue']")
    WebElement continueButton ;


    @FindBy(how = How.XPATH,
            using = "//android.view.View[@text='Log In']")
    WebElement loginbutton  ;

    @FindBy(how = How.XPATH,
            using = "//android.widget.Spinner[@text='Select a state']")
    WebElement selectastatedrop ;

    @FindBy(how = How.ID,
            using = "home-input-city-select")
    WebElement cityinput ;

    @FindBy(how = How.XPATH,
            using = "//android.view.View[@text ='Excellent: 750+']")
    WebElement excellentcreditscore ;

    @FindBy(how = How.XPATH,
            using = "//android.view.View[@text ='Good: 700–749']")
    WebElement goodcreditscore ;

    @FindBy(how = How.XPATH,
            using = "//android.view.View[@text ='Fair: 650–699']")
    WebElement faircreditscore ;

    @FindBy(how = How.XPATH,
            using = "//android.view.View[@text ='Poor: 600–649']")
    WebElement poorcreditscore ;

    @FindBy(how = How.XPATH,
            using = "//android.view.View[@text ='Bad: Below 600']")
    WebElement badcreditscore  ;

    @FindBy(how = How.XPATH,
            using = "//android.view.View[@text='What is your approximate credit score?']")
    WebElement upfrontamountinput ;

    @FindBy(how = How.XPATH,
            using = "//android.widget.EditText[@text ='$']")
    WebElement monyhlyspending ;

    @FindBy(how = How.XPATH,
            using = "//android.widget.Button[@text='Get My Plan']")
    WebElement getmyplanbutton ;




// Only Tap action on the buttons or element
    public void tapContinueWithEmailButton(){
        waitforelement(3);
        continuewithemailButton.click();
        String s = continuewithemailButton.getText();
        Assert.assertEquals(BaseClass.prop.getProperty("emailHometext"),s);
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

    public void tapselectastatedrop (){
        waitforelement(3);
        selectastatedrop.click();
        List dropdown = driver.findElements(By.id("android:id/text1"));

        // Putting in a loop to select different values every time
        for (int i = 0; i < dropdown.size(); i++) {
            // Click on drop down
            MobileElement listItem = (MobileElement) dropdown.get(i);
            System.out.println(listItem.getText());
            listItem.findElement(By.xpath("//android.widget.CheckedTextView[@text='Alabama']")).click();
        }

        utils.scroll();

    }


    public void tapcityinput () throws MalformedInputException{
        waitforelement(3);
        cityinput.click();
        cityinput.sendKeys("ALABASTER");
        waitforelement(3);
        utils.scroll();


    }

    public void tapcreditscroe (){
        waitforelement(3);
        utils.randomcreditscore();
        waitforelement(3);
        utils.scroll();
        driver.hideKeyboard();

    }

    public void tapupfrontamountinput (){
        waitforelement(3);
        upfrontamountinput.click();
        upfrontamountinput.sendKeys(String.valueOf(utils.getRandomIntegerBetweenRange(1,10)));
        utils.scroll();
        driver.hideKeyboard();

    }

    public void tapmonyhlyspending (){
        waitforelement(3);
        monyhlyspending.click();
        monyhlyspending.sendKeys(String.valueOf(utils.getRandomIntegerBetweenRange(1,10)));
        utils.scroll();
        driver.hideKeyboard();

    }

    public void tapGetMyPlanButton (){
        waitforelement(3);
        getmyplanbutton.click();
        waitforelement(3);

    }

//
//    public void tap (){
//        waitforelement(3);
//
//    }
//

// Making Webelement public for random choosing plans


    public WebElement Excellentcreditscore() {
        return excellentcreditscore;
    }

    public WebElement Goodcreditscore(){
        return goodcreditscore;
    }

    public WebElement Faircreditscore() {
        return faircreditscore;
    }

    public WebElement Poorcreditscore(){
        return poorcreditscore;
    }

    public WebElement Badcreditscore() {
        return badcreditscore;
    }

}
