package pages;

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

    @AndroidFindBy(xpath = "//*[@text='Dia 1']")
    @iOSXCUITFindBy(id = "Permitir")
    public static MobileElement idDayOne;

    @AndroidFindBy(xpath = "//*[contains(@text,'Dia 31')]")
    @iOSXCUITFindBy(id = "Permitir")
    public static MobileElement idLastDay;

    @AndroidFindBy(id = "ivPlay")
    @iOSXCUITFindBy(id = "Permitir")
    public static MobileElement idDayPlay1;

    @AndroidFindBy(id = "btn_premium_dialog")
    @iOSXCUITFindBy(id = "Permitir")
    public static MobileElement idstartPracticePremmium;

    public static void scrollScreenFundamentos() {
//        FundamentoPage fundamentoPage = new FundamentoPage();
//        Utils.scrollToElement("up long", fundamentoPage.idLastDay);
//        Utils.scrollToElement("down long", fundamentoPage.idDayOne);
    }

    public static void skipAudio() {
//        PlayerPage playerPage = new PlayerPage();
//        for (int i = 0; i < 10; i++) {
//            try {
//                clickOn(playerPage.idBtnSkipAudio);
//            } catch (Exception error) {
//                log.error("ERRO: Skip audio não está na tela.");
//            }
//        }
    }

}
