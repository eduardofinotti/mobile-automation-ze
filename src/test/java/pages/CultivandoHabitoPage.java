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
    @iOSXCUITFindBy(id = "Permitir")
    public static MobileElement textCultivandoHabitoDayOne;

    @AndroidFindBy(id = "rlpracticeplay_button")
    @iOSXCUITFindBy(id = "Permitir")
    public static MobileElement startPractice;

}
