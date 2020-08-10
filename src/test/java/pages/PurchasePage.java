package pages;

import components.CommonComponents;
import components.MainComponents;
import components.PurchaseComponents;
import io.appium.java_client.android.AndroidKeyCode;
import org.openqa.selenium.By;
import tests.BaseClass;

public class PurchasePage extends BaseClass {

    public static void clickBtnAds(){
        if(waitForElementDisplayed(By.id(PurchaseComponents.idActiveAds))){
            click(By.id(PurchaseComponents.idActiveAds), "[CLICK BTN ADS]", 5);
            captureScreenshot();
        }
    }
    public static void clickOption1(){
        if(waitForElementDisplayed(By.id(PurchaseComponents.idOption1))){
            click(By.id(PurchaseComponents.idOption1), "[CLICK OPTION1]", 5);
            captureScreenshot();
        }
    }
    public static void clickOption2(){
        if(waitForElementDisplayed(By.id(PurchaseComponents.idOption2))){
            click(By.id(PurchaseComponents.idOption2), "[CLICK OPTION2]", 5);
            captureScreenshot();
        }
    }
    public static void clickOption3(){
        if(waitForElementDisplayed(By.id(PurchaseComponents.idOption3))){
            click(By.id(PurchaseComponents.idOption3), "[CLICK OPTION3]", 5);
            captureScreenshot();
        }
    }
    public static void clickOption4(){
        if(waitForElementDisplayed(By.id(PurchaseComponents.idOption1))){
            click(By.id(PurchaseComponents.idOption4), "[CLICK OPTION4]", 5);
            captureScreenshot();
        }
    }
    public static void clickOption5(){
        if(waitForElementDisplayed(By.id(PurchaseComponents.idOption5))){
            click(By.id(PurchaseComponents.idOption5), "[CLICK OPTION5]", 5);
            captureScreenshot();
        }
    }

    public static void backPage(){
        if(waitForElementDisplayed(By.id(CommonComponents.idBtnBack))){
            click(By.id(CommonComponents.idBtnBack), "[CLICK BACK]", 5);
            captureScreenshot();
        }
    }

    public static void clickNext(){
        if(waitForElementDisplayed(By.id(CommonComponents.idBtnNext))){
            click(By.id(CommonComponents.idBtnNext), "[CLICK NEXT]", 10);
            captureScreenshot();
        }
    }
}
