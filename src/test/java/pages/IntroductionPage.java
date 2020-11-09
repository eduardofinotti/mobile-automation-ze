package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Utils;

public class IntroductionPage extends Utils {

    private AppiumDriver driver;

    public IntroductionPage(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "btSkip")
    @iOSXCUITFindBy(accessibility = "Continuar com E-mail")
    public static MobileElement btn_continue_pt;

    @AndroidFindBy(id = "btSkip")
    @iOSXCUITFindBy(accessibility = "Continuar con el correo electrónico")
    public static MobileElement btn_continue_es;

    @AndroidFindBy(id = "btnPortuguese")
    @iOSXCUITFindBy(accessibility = "Continuar en Portugués")
    public static MobileElement btn_language_portuguese;

    @AndroidFindBy(id = "btnSpanish")
    @iOSXCUITFindBy(accessibility = "Continue en Espanhol")
    public static MobileElement btn_language_spanish;

    public void onboarding() {
        if (Utils.isElementDisplayed(btn_language_portuguese)) {
            clickOn(btn_language_portuguese);
        }
        continue_to_login_pt();
    }

    public void continue_to_login_pt() {
        clickOn(btn_continue_pt);
    }

    public void continue_to_login_es() {
        clickOn(btn_continue_es);
    }

    public void language_spanish() {
        clickOn(btn_language_spanish);
    }

    public void language_portuguese() {
        clickOn(btn_language_portuguese);
    }
}
