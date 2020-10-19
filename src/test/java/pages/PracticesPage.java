package pages;

import hooks.BaseClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Utils;

public class PracticesPage extends Utils {

    private AppiumDriver driver;

    public PracticesPage(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "ivPurchase")
    @iOSXCUITFindBy(id = "Permitir")
    public static MobileElement idBottomPrac;

    @AndroidFindBy(id = "cardInstagram")
    @iOSXCUITFindBy(accessibility = "Siga-nos no Instagram!")
    public static MobileElement cardInstagram;

    @AndroidFindBy(id = "tvrecommando_text")
    @iOSXCUITFindBy(id = "Permitir")
    public static MobileElement idTopPrac;

    @AndroidFindBy(xpath = "//*[contains(@text,'31 DIAS • PROGRAMA')]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Lojong\"]/XCUIElementTypeWindow[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeButton")
    public static MobileElement textFundamentosPT;

    @AndroidFindBy(xpath = "//*[contains(@text,'21 dias de meditação começando com práticas de 10 minutos.')]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Lojong\"]/XCUIElementTypeWindow[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeButton")
    public static MobileElement textCultivandoHabitoPT;

    @AndroidFindBy(xpath = "//*[contains(@text,'Cultivando relaxamento, foco, clareza e felicidade genuína.')]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Lojong\"]/XCUIElementTypeWindow[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeButton")
    public static MobileElement textCaminhoPT;
}
