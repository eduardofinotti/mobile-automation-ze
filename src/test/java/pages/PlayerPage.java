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

    private AppiumDriver driver;

    public PlayerPage(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "ivForward")
    @iOSXCUITFindBy(accessibility = "ic advance 10 secs2")
    public static MobileElement idBtnSkipAudio;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@content-desc = 'Rewind 10 secs']")
    @iOSXCUITFindBy(id = "Permitir")
    public static MobileElement xpathBtnSkeepAudio;

    @AndroidFindBy(id = "ivLeftIcon")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"ic close\"]")
    public static MobileElement idCloseBtn;

    @AndroidFindBy(id = "android:id/button1")
    @iOSXCUITFindBy(accessibility = "Sim")
    public static MobileElement idYesCloseBtn;


    public static void closePalyer() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickOn(idCloseBtn);
        clickOn(idYesCloseBtn);
    }
}
