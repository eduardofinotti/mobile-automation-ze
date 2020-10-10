package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;
import hooks.BaseClass;
import utils.Utils;

public class CreateAccountPage extends Utils {

    private AppiumDriver driver;

    public CreateAccountPage(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "btnAlreadyAccount")
    @iOSXCUITFindBy(id = "Permitir")
    public static MobileElement idBtnToLogin;

    @AndroidFindBy(id = "btnCreateAccount")
    @iOSXCUITFindBy(id = "Permitir")
    public static MobileElement idBtnCreateAccount;

}
