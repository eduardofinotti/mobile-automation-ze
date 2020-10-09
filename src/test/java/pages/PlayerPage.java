package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;
import hooks.BaseClass;
import utils.Utils;

public class PlayerPage extends Utils {

    public PlayerPage() {
        AppiumDriver driver = new BaseClass().driver.get();
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "ivForward")
    @iOSXCUITFindBy(id = "Permitir")
    public static MobileElement idBtnSkipAudio;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@content-desc = 'Rewind 10 secs']")
    @iOSXCUITFindBy(id = "Permitir")
    public static MobileElement xpathBtnSkeepAudio;

    @AndroidFindBy(id = "ivLeftIcon")
    @iOSXCUITFindBy(id = "Permitir")
    public static MobileElement idCloseBtn;

    @AndroidFindBy(id = "android:id/button1")
    @iOSXCUITFindBy(id = "Permitir")
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
