package pages;

import components.CreateAccountComponents;
import components.IntroductionComponents;
import components.LoginComponents;
import org.openqa.selenium.By;
import tests.BaseClass;

public class LoginPage extends BaseClass {

    public static String email = "testcompra@gmail.com";
    public static String password = "1234";

    public static void enterEmail() {
        sendKeys(By.id(LoginComponents.idBtnEmail), email, 3, email);
    }

    public static void enterPassword() {
        sendKeys(By.id(LoginComponents.idBtnPassword), password, 3, password);
    }

    public static void clickLogin(){
        if(waitForElementDisplayed(By.xpath(LoginComponents.xpathEnterButton))){
            click(By.xpath(LoginComponents.xpathEnterButton), "[DO LOGIN ]", 15);
            //captureScreenshot();
        }
    }

}
