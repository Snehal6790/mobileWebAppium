package utils;

import mobileViewPages.HomePage;
import mobiledriver.BaseClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.*;
import java.util.concurrent.TimeUnit;

import static mobileViewPages.HomePage.*;

public class Utils extends BaseClass {

    public Utils() {

        PageFactory.initElements(driver, this);
    }


    public static void sync(long timeUnit) {
        driver.manage().timeouts().implicitlyWait(timeUnit, TimeUnit.SECONDS);

    }

    public static void waitforelement(long timeUnit) {

        try {
            Thread.sleep(timeUnit);
        } catch (Exception e) {
            System.out.println("Something went wrong with WaitForElement Method ");
        }
    }


    public static void scroll(){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,3000)","");


    }

    public static WebElement randomcreditscore() {

        ArrayList <WebElement> randelement = new ArrayList();
        try {
            randelement.add(Excellentcreditscore());
            randelement.add(Badcreditscore());
            randelement.add(Faircreditscore());
            randelement.add(Goodcreditscore());
            randelement.add(Poorcreditscore());
            for (int i = 0; i <= randelement.size(); i++) {
                Collections.shuffle(randelement);
                System.out.println(randelement.get(0));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return randelement.get(0);
    }

    public static double getRandomIntegerBetweenRange(double min, double max){
        double x = (int)(Math.random()*((max-min)+1))+min;
        return x;
    }




}

