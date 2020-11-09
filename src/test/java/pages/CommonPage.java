package pages;

import hooks.BaseClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Utils;

public class CommonPage extends Utils {

    private AppiumDriver driver;

    public CommonPage(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "btn_premium_dialog")
    @iOSXCUITFindBy(accessibility = "INICIAR")
    public static MobileElement start_practice;

    @AndroidFindBy(id = "ivLeftIcon")
    @iOSXCUITFindBy(accessibility = "back")
    public static MobileElement btn_close;

    @AndroidFindBy(id = "btn_continue")
    @iOSXCUITFindBy(id = "Permitir")
    public static MobileElement btn_next;

    @AndroidFindBy(id = "ivRightIcon")
    @iOSXCUITFindBy(id = "Permitir")
    public static MobileElement btn_back;

    public void startPratice() {
        clickOn(start_practice);
    }

    public void backToHome() throws InterruptedException {

        HomePage homePage = new HomePage(BaseClass.driver.get());

        while (!Utils.isElementDisplayed(homePage.tab_insight)){
            if (System.getProperty("platform").equalsIgnoreCase("android")) {
                clickOn(btn_close);
            } else {
                Thread.sleep(1000);
                Utils.backScreenIOS();
            }
        }

    }
}
