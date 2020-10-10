package pages;

import hooks.BaseClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;

public class PurchasePage extends BaseClass {

    private AppiumDriver driver;

    public PurchasePage(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "btn_adsactivate")
    @iOSXCUITFindBy(id = "Permitir")
    public static MobileElement idActiveAds;

    @AndroidFindBy(id = "option_1")
    @iOSXCUITFindBy(id = "Permitir")
    public static MobileElement idOption1;

    @AndroidFindBy(id = "option_2")
    @iOSXCUITFindBy(id = "Permitir")
    public static MobileElement idOption2;

    @AndroidFindBy(id = "option_3")
    @iOSXCUITFindBy(id = "Permitir")
    public static MobileElement idOption3;

    @AndroidFindBy(id = "option_4")
    @iOSXCUITFindBy(id = "Permitir")
    public static MobileElement idOption4;

    @AndroidFindBy(id = "option_5")
    @iOSXCUITFindBy(id = "Permitir")
    public static MobileElement idOption5;
}
