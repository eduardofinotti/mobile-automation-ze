package pages;

import components.MainComponents;
import org.openqa.selenium.By;
import tests.BaseClass;

public class MainPage extends BaseClass {

    public static void clickInsight(){
        if(waitForElementDisplayed(By.id(MainComponents.idBtnInsight))){
            click(By.id(MainComponents.idBtnInsight), "[CLICH INSIGHT]", 5);
            captureScreenshot();
        }
    }

    public static void clickMenu(){
        if(waitForElementDisplayed(By.id(MainComponents.idBtnMain))){
            click(By.id(MainComponents.idBtnMain), "[CLICK MENU]", 5);
           // captureScreenshot();
        }
    }
}
