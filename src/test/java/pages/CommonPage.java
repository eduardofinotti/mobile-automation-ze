package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;
import hooks.BaseClass;

public class CommonPage extends BaseClass {

    private AppiumDriver driver;

    public CommonPage(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }


    @AndroidFindBy(id = "btn_premium_dialog")
    @iOSXCUITFindBy(accessibility = "INICIAR")
    public static MobileElement idstartPracticePremmium;

    @AndroidFindBy(id = "ivLeftIcon")
    @iOSXCUITFindBy(accessibility = "back")
    public static MobileElement idCloseBtn;

    @AndroidFindBy(id = "btn_continue")
    @iOSXCUITFindBy(id = "Permitir")
    public static MobileElement idBtnNext;

    @AndroidFindBy(id = "ivRightIcon")
    @iOSXCUITFindBy(id = "Permitir")
    public static MobileElement idBtnBack;
}
