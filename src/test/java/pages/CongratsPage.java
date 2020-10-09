package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;
import hooks.BaseClass;
import utils.Utils;

public class CongratsPage extends Utils {

    public CongratsPage() {
        AppiumDriver driver = new BaseClass().driver.get();
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "btnNext")
    @iOSXCUITFindBy(id = "Permitir")
    public static MobileElement idBtnNext;

    @AndroidFindBy(id = "btnCancel")
    @iOSXCUITFindBy(id = "Permitir")
    public static MobileElement idBtnCancel;

}
