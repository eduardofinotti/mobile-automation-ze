package pages;

import components.MainComponents;
import org.openqa.selenium.By;
import tests.BaseClass;

public abstract class MainPage extends BaseClass {

    public static void clickInsight(){
        if(waitForElementDisplayed(By.id(MainComponents.idBtnInsight))){
            click(By.id(MainComponents.idBtnInsight), "[CLICH INSIGHT]", 5);
            captureScreenshot();
        }
    }
}
