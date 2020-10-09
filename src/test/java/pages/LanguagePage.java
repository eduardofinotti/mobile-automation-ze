package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;
import hooks.BaseClass;

public class LanguagePage extends BaseClass {

    public LanguagePage() {
        AppiumDriver driver = new BaseClass().driver.get();
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "btnPortuguese")
    @iOSXCUITFindBy(id = "Permitir")
    public static MobileElement idBtnPortuguese;

    @AndroidFindBy(id = "btnSpanish")
    @iOSXCUITFindBy(id = "Permitir")
    public static MobileElement idBtnSpanish;
}
