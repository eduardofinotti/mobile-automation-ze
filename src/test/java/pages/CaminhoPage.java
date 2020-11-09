package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Utils;

public class CaminhoPage extends Utils {

    private AppiumDriver driver;

    public CaminhoPage(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "ivIconWay1")
    @iOSXCUITFindBy(accessibility = "path img2")
    public static MobileElement day_1;

    @AndroidFindBy(id = "ivPlay")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell[1]")
    public static MobileElement play_1;

    public void playAudio1() {
        clickOn(play_1);
    }

    public void enterDay1() {
        clickOn(day_1);
    }
}
