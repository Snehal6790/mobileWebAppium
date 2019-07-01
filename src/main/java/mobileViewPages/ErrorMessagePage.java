package mobileViewPages;

import coretest.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

public class ErrorMessagePage extends BaseClass{

    public ErrorMessagePage(){

        PageFactory.initElements(driver,this);
    }

    SoftAssert softAssertion= new SoftAssert();



        @FindBy(how = How.XPATH,
            using = "//div[@class='error-msg'][contains(.,'Please enter a valid email')]")
    WebElement emailValidationMessage;

    @FindBy(how = How.XPATH,
            using = "//div[@class='error-msg'][contains(.,'Please select a state')]")
    WebElement stateValidationMessage ;

    @FindBy(how = How.XPATH,
            using = "//div[@class='error-msg'][contains(.,'Please enter a valid city')]")
    WebElement cityValidationMessage ;

    @FindBy(how = How.XPATH,
            using = "//div[@class='error-msg'][contains(.,'Please enter a future date')]")
    WebElement homeValidationdateMessage ;

    @FindBy(how = How.XPATH,
            using = "//div[@class='error-msg'][contains(.,'Please enter your expected down payment')]")
    WebElement upfrontErrorMessage ;

    @FindBy(how = How.XPATH,
            using = "//div[@class='error-msg'][contains(.,'Please enter your expected monthly payment')]")
    WebElement MonthlyErrorMessage ;



    public void EmailValidation(){
        String s = emailValidationMessage.getText();
        System.out.println(emailValidationMessage.getText());
        if(s!=null) {
            softAssertion.assertEquals(s, BaseClass.prop.getProperty("emailValidationMessage"));
            softAssertion.assertTrue(true);
        }else {
            System.out.println("Validation didn't run");
        }
    }

    public void StateValidation(){
        String s = stateValidationMessage.getText();
        System.out.println(stateValidationMessage.getText());
        if(s!=null) {
            softAssertion.assertEquals(s, BaseClass.prop.getProperty("stateValidationMessage"));
            softAssertion.assertTrue(true);
        }else {
            System.out.println("Validation didn't run");
        }
    }

    public void CityValidation(){
        String s = cityValidationMessage.getText();
        System.out.println(cityValidationMessage.getText());
        if(s!=null) {
            softAssertion.assertEquals(s, BaseClass.prop.getProperty("cityValidationMessage"));
            softAssertion.assertTrue(true);
        }else {
            System.out.println("Validation didn't run");
        }
    }

    public void HomeValidationdate(){
        String s = homeValidationdateMessage.getText();
        System.out.println(homeValidationdateMessage.getText());
        if(s!=null) {
                softAssertion.assertEquals(s,BaseClass.prop.getProperty("homeValidationdateMessage"));
                softAssertion.assertTrue(true);
        }else {
            System.out.println("Validation didn't run");
        }
    }

    public void UpfrontValidation(){
        String s = upfrontErrorMessage.getText();
        System.out.println(upfrontErrorMessage.getText());
        if(s!=null) {
                softAssertion.assertEquals(s,BaseClass.prop.getProperty("upfrontErrorMessage"));
                softAssertion.assertTrue(true);
    }else {
        System.out.println("Validation didn't run");
    }
    }

    public void MonthlyValidation(){
        String s = MonthlyErrorMessage.getText();
        System.out.println(MonthlyErrorMessage.getText());
        if(s!=null) {
        softAssertion.assertEquals(s,BaseClass.prop.getProperty("monthlyErrorMessage"));
        softAssertion.assertTrue(true);
        }else {
            System.out.println("Validation didn't run");
        }
    }


}
