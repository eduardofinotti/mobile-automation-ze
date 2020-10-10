package pages;

import hooks.BaseClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Utils;

public class LoginPage extends Utils {

    public static String emailPremium = "testcompra@gmail.com";
    public static String email = "eduardo.finotti.ef@gmail.com";
    public static String password = "1234";

    private AppiumDriver driver;

    public LoginPage(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "etEmail")
    @iOSXCUITFindBy(id = "Permitir")
    public static MobileElement idBtnEmail;

    @AndroidFindBy(id = "etPassword")
    @iOSXCUITFindBy(id = "Permitir")
    public static MobileElement idBtnPassword;

    @AndroidFindBy(xpath = "(//android.widget.Button[@index='0'])[1]")
    @iOSXCUITFindBy(id = "Permitir")
    public static MobileElement xpathEnterButton;

    public static void doLoginEmail() throws InterruptedException {
        Thread.sleep(1000);
        fillField(LoginPage.idBtnEmail, LoginPage.emailPremium);
        Thread.sleep(1000);
        fillField(LoginPage.idBtnPassword, LoginPage.password);
        clickOn(LoginPage.xpathEnterButton);
    }

}
