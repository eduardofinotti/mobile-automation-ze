package pages;

import components.IntroductionComponents;
import org.openqa.selenium.By;
import tests.BaseClass;

public abstract class IntroductionPage extends BaseClass {

    public static void clickSkip(){
        pause(10);
        if(waitForElementDisplayed(By.id(IntroductionComponents.idBtnSkip))){
            click(By.id(IntroductionComponents.idBtnSkip), "[Skip] button", 5);
            captureScreenshot();
        }
    }
}
