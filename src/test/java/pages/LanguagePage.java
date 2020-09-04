package pages;

import components.IntroductionComponents;
import components.LanguageComponents;
import io.appium.java_client.android.AndroidKeyCode;
import org.openqa.selenium.By;
import tests.BaseClass;

public class LanguagePage extends BaseClass {

    public static void clickPortuguese(){
        pause(5);
        captureScreenshot();
        pause(5);
        if(waitForElementDisplayed(By.id(LanguageComponents.idBtnPortuguese))){
            click(By.id(LanguageComponents.idBtnPortuguese), "[CLICK PORTUGUESE]", 5);
            //captureScreenshot();
        }
    }

    public static void clickSpanish(){
        pause(5);
        captureScreenshot();
        pause(5);
        if(waitForElementDisplayed(By.id(LanguageComponents.idBtnSpanish))){
            click(By.id(LanguageComponents.idBtnSpanish), "[CLICK SPANISH]", 5);
           // captureScreenshot();
        }
    }

    public static void backPage(){
        driver.pressKeyCode(AndroidKeyCode.BACK);
    }

}
