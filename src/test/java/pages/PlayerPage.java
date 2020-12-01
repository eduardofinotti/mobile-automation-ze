package pages;

import hooks.BaseClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Utils;

public class PlayerPage extends Utils {

    private final AppiumDriver driver;

    public PlayerPage(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "ivForward")
    @iOSXCUITFindBy(accessibility = "ic advance 10 secs2")
    public static MobileElement btn_skip_audio;

    @AndroidFindBy(id = "ivLeftIcon")
    @iOSXCUITFindBy(accessibility = "BackButton")
    public static MobileElement btn_close_audio;

    @AndroidFindBy(id = "btnYes")
    @iOSXCUITFindBy(accessibility = "Sim")
    public static MobileElement btn_confirm_close_audio;

    @AndroidFindBy(id = "ivPlayStop")
    @iOSXCUITFindBy(accessibility = "pause")
    public static MobileElement btn_stop_player;

    public static void closePalyer() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (BaseClass.platform_run.equalsIgnoreCase("android")) {
            clickOn(btn_close_audio);
        } else {
            Utils.backScreenIOS();
        }

        clickOn(btn_confirm_close_audio);
    }
}