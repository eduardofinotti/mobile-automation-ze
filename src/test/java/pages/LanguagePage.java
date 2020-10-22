package pages;

import hooks.BaseClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;

public class LanguagePage extends BaseClass {

    private AppiumDriver driver;

    public LanguagePage(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    @AndroidFindBy(id = "btnPortuguese")
    @iOSXCUITFindBy(accessibility = "Continuar en Portugués")
    public static MobileElement idBtnPortuguese;

    @AndroidFindBy(id = "btnSpanish")
    @iOSXCUITFindBy(accessibility = "Continue en Espanhol")
    public static MobileElement idBtnSpanish;
}
