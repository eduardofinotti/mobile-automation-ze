package pages;

import components.CreateAccountComponents;
import components.IntroductionComponents;
import org.openqa.selenium.By;
import tests.BaseClass;

public class CreateAccountPage extends BaseClass {

    public static void clickToLogin(){
        if(waitForElementDisplayed(By.id(CreateAccountComponents.idBtnToLogin))){
            click(By.id(CreateAccountComponents.idBtnToLogin), "[TO LOGIN PAGE]", 5);
            //captureScreenshot();
        }
    }
}
