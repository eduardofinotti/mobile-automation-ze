package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Utils;

public class HomePage extends Utils {

    private AppiumDriver driver;

    public HomePage(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "cardInstagram")
    @iOSXCUITFindBy(accessibility = "Siga-nos no Instagram!")
    public static MobileElement card_instagram;

    @AndroidFindBy(xpath = "//*[contains(@text,'31 DIAS • PROGRAMA')]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Lojong\"]/XCUIElementTypeWindow[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeButton")
    public static MobileElement txt_fundamentos;

    @AndroidFindBy(xpath = "//*[contains(@text,'21 dias de meditação começando com práticas de 10 minutos.')]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Lojong\"]/XCUIElementTypeWindow[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeButton")
    public static MobileElement txt_cultivando_o_habito;

    @AndroidFindBy(xpath = "//*[contains(@text,'Cultivando relaxamento, foco, clareza e felicidade genuína.')]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Lojong\"]/XCUIElementTypeWindow[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeButton")
    public static MobileElement txt_caminho;

    @AndroidFindBy(id = "llInsight")
    @iOSXCUITFindBy(accessibility = "Insight")
    public static MobileElement tab_insight;

    @AndroidFindBy(id = "llTimer")
    @iOSXCUITFindBy(accessibility = "Insight")
    public static MobileElement tab_tools;

    public static void scrollToInstagramCard() {
        Utils.scrollToElement("down long", card_instagram);
    }

    public void enterInsightTab() {
        clickOn(tab_insight);
    }

    public void scrollToCultivandoHabito() {
        Utils.scrollToElement("up long", txt_cultivando_o_habito);
    }

    public void enterOnCultivandoHabito() {
        clickOn(txt_cultivando_o_habito);
    }

    public void enterOnCaminho() {
        clickOn(txt_caminho);
    }

    public void scrollToFundamentos() {
        Utils.scrollToElement("down long", txt_fundamentos);
    }

    public void enterOnFundamentos() {
        clickOn(txt_fundamentos);
    }

    public void enterToolsTab() {
        clickOn(tab_tools);
    }
}
