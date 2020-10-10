package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;
import hooks.BaseClass;

public class CaminhoPage extends BaseClass {

    private AppiumDriver driver;

    public CaminhoPage(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "ivIconWay1")
    @iOSXCUITFindBy(id = "Permitir")
    public static MobileElement idDayOne;

    @AndroidFindBy(id = "ivPlay")
    @iOSXCUITFindBy(id = "Permitir")
    public static MobileElement idDayPlay1;
}
