package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;
import hooks.BaseClass;
import utils.Utils;

public class PracticesPage extends Utils {

    public PracticesPage() {
        AppiumDriver driver = new BaseClass().driver.get();
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "ivPurchase")
    @iOSXCUITFindBy(id = "Permitir")
    public static MobileElement idBottomPrac;

    @AndroidFindBy(id = "cardInstagram")
    @iOSXCUITFindBy(id = "Permitir")
    public static MobileElement cardInstagram;

    @AndroidFindBy(id = "tvrecommando_text")
    @iOSXCUITFindBy(id = "Permitir")
    public static MobileElement idTopPrac;

    @AndroidFindBy(xpath = "//*[contains(@text,'31 DIAS • PROGRAMA')]")
    @iOSXCUITFindBy(id = "Permitir")
    public static MobileElement textFundamentosPT;

    @AndroidFindBy(xpath = "//*[contains(@text,'21 dias de meditação começando com práticas de 10 minutos.')]")
    @iOSXCUITFindBy(id = "Permitir")
    public static MobileElement textCultivandoHabitoPT;

    @AndroidFindBy(xpath = "//*[contains(@text,'Cultivando relaxamento, foco, clareza e felicidade genuína.')]")
    @iOSXCUITFindBy(id = "Permitir")
    public static MobileElement textCaminhoPT;
}
