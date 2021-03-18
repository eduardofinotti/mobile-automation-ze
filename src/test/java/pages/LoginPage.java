package pages;

import hooks.BaseClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import utils.Utils;

public class LoginPage extends Utils {

    public static String email = "eduardo.finotti@hotmail.com";
    public static String password = "amarelo1212";

    private static AppiumDriver driver;
    private static Logger log = LoggerFactory.getLogger(LoginPage.class);

    public LoginPage(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(accessibility = "already-have-an-account")
    @iOSXCUITFindBy(accessibility = "already-have-an-account")
    public static MobileElement btn_already_account;

    @AndroidFindBy(accessibility = "email")
    @iOSXCUITFindBy(accessibility = "email")
    public static MobileElement field_email;

    @AndroidFindBy(accessibility = "password")
    @iOSXCUITFindBy(accessibility = "password")
    public static MobileElement field_password;

    @AndroidFindBy(accessibility = "enter")
    @iOSXCUITFindBy(accessibility = "enter")
    public static MobileElement btn_enter;

    @iOSXCUITFindBy(accessibility = "Allow")
    public static MobileElement allow_notification;

    @AndroidFindBy(id = "com.android.permissioncontroller:id/permission_allow_foreground_only_button")
    @iOSXCUITFindBy(accessibility = "Permitir Durante o Uso do App")
    public static MobileElement allow_location;

    @AndroidFindBy(accessibility = "onboarding-secondary-action-button")
    @iOSXCUITFindBy(accessibility = "onboarding-secondary-action-button")
    public static MobileElement btn_skip_onboarding;

    @AndroidFindBy(accessibility = "create-account-later")
    @iOSXCUITFindBy(accessibility = "create-account-later")
    public static MobileElement btn_continue_guest;

    @AndroidFindBy(accessibility = "button-yes")
    @iOSXCUITFindBy(xpath = "(//*[@name=\"button-yes\"])[2]")
    public static MobileElement btn_have_18_years;

    @AndroidFindBy(accessibility = "button-no")
    @iOSXCUITFindBy(xpath = "(//*[@name=\"button-no\"])[2]")
    public static MobileElement btn_no_have_18_years;

    private static boolean isAcceptLocationAndroid = false;

    public static void login() throws InterruptedException {
        Thread.sleep(10000);
        allowNotifications();
        skipObboarding();
        allowNotifications();

        clickOn(btn_already_account);
        fillField(field_email, email);
        fillField(field_password, password);
        clickOn(btn_enter);
    }

    public static void skipObboarding() {
        if (BaseClass.platform_run.equalsIgnoreCase("ios")) {
            if (isElementDisplayed(btn_skip_onboarding)) {
                clickOn(btn_skip_onboarding);
            }
        } else {
            while (!isElementDisplayed(btn_already_account)) {
                try {
                    if (isElementDisplayed(allow_location)) {
                        clickOn(allow_location);
                        isAcceptLocationAndroid = true;
                    }
                    clickOn(btn_skip_onboarding);
                } catch (Exception e) {
                    log.info("Elemento " + btn_skip_onboarding + " não está presente.");
                }
            }
        }
    }

    public static void login_as_guest() throws InterruptedException {
        Thread.sleep(10000);
        allowNotifications();
        skipObboarding();
        if (!isAcceptLocationAndroid) {
            allowNotifications();
        }
        clickOn(btn_continue_guest);
    }

    public static void choose_18_years() {
        clickOn(btn_have_18_years);
    }

    public static void choose_is_children() {
        clickOn(btn_no_have_18_years);
    }

    public static void check_is_logged_guest() {
        AddressPage addressPage = new AddressPage(driver);
        Assert.assertTrue(isElementDisplayed(addressPage.field_search_address));
    }

    public static void check_exit_app() {
        AddressPage addressPage = new AddressPage(driver);
        Assert.assertFalse(isElementDisplayed(addressPage.field_search_address));
    }

    public static void allowNotifications() {
        if (isElementDisplayed(allow_location)) {
            try {
                clickOn(allow_location);
                if (BaseClass.platform_run.equalsIgnoreCase("ios")) {
                    clickOn(allow_notification);
                }
            } catch (Exception e) {
            }
        }
        if (BaseClass.platform_run.equalsIgnoreCase("ios")) {
            if (isElementDisplayed(allow_notification)) {
                try {
                    if (BaseClass.platform_run.equalsIgnoreCase("ios")) {
                        clickOn(allow_notification);
                    }
                    clickOn(allow_location);
                } catch (Exception e) {
                }
            }
        }
    }
}
