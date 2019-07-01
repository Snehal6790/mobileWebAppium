package mobileViewPages;

import mobiledriver.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class ErrorMessagePage extends BaseClass{

    public ErrorMessagePage(){

        PageFactory.initElements(driver,this);
    }

    SoftAssert softAssertion= new SoftAssert();



        @FindBy(how = How.XPATH,
            using = "android.view.View[@text='Please enter a valid email']")
    WebElement emailValidationMessage;

    @FindBy(how = How.XPATH,
            using = "//android.view.View[@text='Please select a state']")
    WebElement stateValidationMessage ;

    @FindBy(how = How.XPATH,
            using = "//android.view.View[@text='Please enter a valid city']")
    WebElement cityValidationMessage ;

    @FindBy(how = How.XPATH,
            using = "//android.view.View[@text='Please enter a future date']")
    WebElement homeValidationdateMessage ;

    @FindBy(how = How.XPATH,
            using = "//android.view.View[@text='Please enter your expected down payment']")
    WebElement upfrontErrorMessage ;

    @FindBy(how = How.XPATH,
            using = "//android.view.View[@text='Please enter your expected monthly payment']")
    WebElement MonthlyErrorMessage ;



    public void EmailValidation(){
        softAssertion.assertEquals(emailValidationMessage.getText(),BaseClass.prop.getProperty("emailValidationMessage"));
        softAssertion.assertTrue(true);
    }

    public void StateValidation(){
        softAssertion.assertEquals(stateValidationMessage.getText(),BaseClass.prop.getProperty("stateValidationMessage"));
        softAssertion.assertTrue(true);
    }

    public void CityValidation(){
        softAssertion.assertEquals(cityValidationMessage.getText(),BaseClass.prop.getProperty("cityValidationMessage"));
        softAssertion.assertTrue(true);
    }
    public void HomeValidationdate(){
        softAssertion.assertEquals(homeValidationdateMessage.getText(),BaseClass.prop.getProperty("homeValidationdateMessage"));
        softAssertion.assertTrue(true);
    }

    public void UpfrontValidation(){
        softAssertion.assertEquals(upfrontErrorMessage.getText(),BaseClass.prop.getProperty("upfrontErrorMessage"));
        softAssertion.assertTrue(true);
    }

    public void MonthlyValidation(){
        softAssertion.assertEquals(MonthlyErrorMessage.getText(),BaseClass.prop.getProperty("monthlyErrorMessage"));
        softAssertion.assertTrue(true);
    }


}
