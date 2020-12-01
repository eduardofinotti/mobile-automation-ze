package pages;

import hooks.BaseClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import utils.Utils;

public class FundamentoPage extends Utils {

    private static Logger log = LoggerFactory.getLogger(FundamentoPage.class);

    private AppiumDriver driver;

    public FundamentoPage(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath = "//*[@text='1']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Dia 1\"]")
    public static MobileElement day_1;

    @AndroidFindBy(xpath = "//*[contains(@text,'31')]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Dia 31\"]")
    public static MobileElement day_31;

    @AndroidFindBy(id = "ivPlay")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeCell[1]")
    public static MobileElement play_1;

    @AndroidFindBy(id = "btn_premium_dialog")
    @iOSXCUITFindBy(accessibility = "INICIAR")
    public static MobileElement btn_start_pratice;

    public static void scrollScreenFundamentos() {
        FundamentoPage fundamentoPage = new FundamentoPage(BaseClass.driver.get());
        Utils.scrollToElement("up long", fundamentoPage.day_31);
        Utils.scrollToElement("down long", fundamentoPage.day_1);
    }

    public static void skipAudio() {
        PlayerPage playerPage = new PlayerPage(BaseClass.driver.get());
        int quantity = 30;

        if (BaseClass.platform_run.equalsIgnoreCase("android")) {
            quantity = 10;
        }

        for (int i = 0; i < quantity; i++) {
            try {
                clickOn(playerPage.btn_skip_audio);
            } catch (Exception error) {
                log.error("ERRO: Skip audio não está na tela.");
                break;
            }
        }
    }

    public void enterDay1() {
        clickOn(day_1);
    }

    public void playAudio1() {
        clickOn(play_1);
    }

    public void startPratice() {
        clickOn(btn_start_pratice);
    }
}
