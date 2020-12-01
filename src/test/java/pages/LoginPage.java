package pages;

import hooks.BaseClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.Utils;

public class LoginPage extends Utils {

    public static String emailPremium = "testcompra@gmail.com";
    public static String email = "eduardo.finotti@hotmail.com";
    public static String password = "123456789";

    private AppiumDriver driver;

    public LoginPage(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "btnAlreadyAccount")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Já tenho uma Conta\"]")
    public static MobileElement btn_already_account;

    @AndroidFindBy(id = "etEmail")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[1]")
    public static MobileElement field_email;

    @AndroidFindBy(id = "etPassword")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[2]")
    public static MobileElement field_password;

    @AndroidFindBy(xpath = "(//android.widget.Button[@index='0'])[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Entrar\"]")
    public static MobileElement btn_enter;

    @AndroidFindBy(xpath = "//android.widget.RelativeLayout/android.widget.TextView")
    @iOSXCUITFindBy(accessibility = "CADASTRE-SE")
    public static MobileElement title_register_pt;

    @AndroidFindBy(xpath = "//android.widget.RelativeLayout/android.widget.TextView")
    @iOSXCUITFindBy(accessibility = "REGISTRO")
    public static MobileElement title_register_es;

    @iOSXCUITFindBy(accessibility = "Allow")
    public static MobileElement allow;

    public static void login(String email) throws InterruptedException {
        clickOn(btn_already_account);
        Thread.sleep(1000);
        fillField(field_email, email);
        Thread.sleep(1000);
        fillField(field_password, password);
        clickOn(btn_enter);

        if(!BaseClass.platform_run.equalsIgnoreCase("android")) {
            clickOn(allow);
        }
    }

    public void checkLanguageES() {
        String title_register = getText(title_register_es);
        Assert.assertEquals(title_register, "REGISTRO");
    }

    public void checkLanguagePT() {
        String title_register = getText(title_register_pt);
        Assert.assertEquals(title_register, "CADASTRE-SE");
    }
}
