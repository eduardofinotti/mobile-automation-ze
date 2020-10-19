package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Utils;

public class CongratsPage extends Utils {

    private AppiumDriver driver;

    public CongratsPage(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "btnNext")
    @iOSXCUITFindBy(id = "Permitir")
    public static MobileElement idBtnNext;

    @AndroidFindBy(id = "btnCancel")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Lojong\"]/XCUIElementTypeWindow[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeButton[2]")
    public static MobileElement idBtnCancel;

}
