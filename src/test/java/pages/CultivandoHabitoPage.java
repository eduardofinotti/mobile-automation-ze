package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Utils;

public class CultivandoHabitoPage extends Utils {

    private AppiumDriver driver;

    public CultivandoHabitoPage(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath = "//*[@text='1']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"1\"]")
    public static MobileElement txt_day_1;

    @AndroidFindBy(id = "rlpracticeplay_button")
    @iOSXCUITFindBy(accessibility = "INICIAR")
    public static MobileElement start_practice;

    public void startPratice() {
        clickOn(start_practice);
    }

    public void enterDay1() {
        clickOn(txt_day_1);
    }
}
