package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Utils;

public class OptionsPage extends Utils {

    private AppiumDriver driver;

    public OptionsPage(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath = "//*[contains(@text,'DIÁRIO DA GRATIDÃO')]")
    @iOSXCUITFindBy(accessibility = "DIÁRIO DA GRATIDÃO")
    public static MobileElement btn_diario_gratidao;

    public void enterOnDiarioDaGratidao() {
        clickOn(btn_diario_gratidao);
    }
}