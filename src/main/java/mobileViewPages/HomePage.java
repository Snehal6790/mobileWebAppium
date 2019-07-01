package mobileViewPages;

import io.appium.java_client.MobileElement;
import mobiledriver.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.nio.charset.MalformedInputException;
import java.util.List;
import java.util.Random;

import static utils.Utils.*;


public class HomePage extends BaseClass {

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
    static
    WebElement excellentcreditscore ;

    @FindBy(how = How.XPATH,
            using = "//android.view.View[@text ='Good: 700–749']")
    static
    WebElement goodcreditscore ;

    @FindBy(how = How.XPATH,
            using = "//android.view.View[@text ='Fair: 650–699']")
    static
    WebElement faircreditscore ;

    @FindBy(how = How.XPATH,
            using = "//android.view.View[@text ='Poor: 600–649']")
    static
    WebElement poorcreditscore ;

    @FindBy(how = How.XPATH,
            using = "//android.view.View[@text ='Bad: Below 600']")
    static
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


    public String emailid() {
        String randmemail = "";
        Random rad = new Random();
        for (int j = 1; j <= 1; j++) {
            randmemail = "pefinAutomationTest" + rad.nextInt(100) + "@gmail.com";
        }
        return randmemail;
    }


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
        inputEmailId.sendKeys(emailid());
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

        scroll();

    }




    public void tapcityinput () throws MalformedInputException{
        waitforelement(3);
        cityinput.click();
        cityinput.sendKeys("ALABASTER");
        waitforelement(3);
        scroll();


    }

    public void tapcreditscroe (){
        waitforelement(3);
        randomcreditscore();
        waitforelement(3);
        scroll();
        driver.hideKeyboard();

    }

    public void tapupfrontamountinput (){
        waitforelement(3);
        upfrontamountinput.click();
        upfrontamountinput.sendKeys(String.valueOf(getRandomIntegerBetweenRange(1,10)));
        scroll();
        driver.hideKeyboard();

    }

    public void tapmonyhlyspending (){
        waitforelement(3);
        monyhlyspending.click();
        monyhlyspending.sendKeys(String.valueOf(getRandomIntegerBetweenRange(1,10)));
        scroll();
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

}
