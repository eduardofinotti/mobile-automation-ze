package pages;

import hooks.BaseClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BaseClass {

    private AppiumDriver driver;

    public MainPage(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "llInsight")
    @iOSXCUITFindBy(id = "Permitir")
    public static MobileElement idBtnInsight;

    @AndroidFindBy(id = "llMain")
    @iOSXCUITFindBy(id = "Permitir")
    public static MobileElement idBtnMain;
}
