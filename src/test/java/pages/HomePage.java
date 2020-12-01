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
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Fundamentos\"]")
    public static MobileElement txt_fundamentos;

    @AndroidFindBy(xpath = "//*[contains(@text,'21 dias de meditação começando com práticas de 10 minutos.')]")
    @iOSXCUITFindBy(xpath = "\t\n" +
            "//XCUIElementTypeStaticText[@name=\"Cultivando o Hábito\"]")
    public static MobileElement txt_cultivando_o_habito;

    @AndroidFindBy(xpath = "//*[contains(@text,'Cultivando relaxamento, foco, clareza e felicidade genuína.')]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Caminho\"])[2]")
    public static MobileElement txt_caminho;

    @AndroidFindBy(xpath = "//*[contains(@text,'Aprendendo uma nova forma de lidar com as aflições.')]")
    @iOSXCUITFindBy(xpath = "\t\n" +
            "//XCUIElementTypeStaticText[@name=\"Acolhendo a Ansiedade\"]")
    public static MobileElement txt_acolhendo_ansiedade;

    @AndroidFindBy(xpath = "//*[contains(@text,'Práticas de atenção plena para o momento presente.')]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Programa Mindfulness\"]")
    public static MobileElement txt_mindfulness;

    @AndroidFindBy(id = "llInsight")
    @iOSXCUITFindBy(accessibility = "Insight")
    public static MobileElement tab_insight;

    @AndroidFindBy(id = "llTimer")
    @iOSXCUITFindBy(accessibility = "Insight")
    public static MobileElement tab_tools;

    @AndroidFindBy(id = "llMain")
    @iOSXCUITFindBy(accessibility = "Mais")
    public static MobileElement tab_more;

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

    public void enterAcolhendoAnsiedade() {
        clickOn(txt_acolhendo_ansiedade);
    }

    public void enterProgramaMindfulness() {
        clickOn(txt_mindfulness);
    }

    public void scrollToFundamentos() {
        Utils.scrollToElement("down", txt_fundamentos);
    }

    public void scrollToAcolhendoAnsiedade() {
        Utils.scrollToElement("down long", txt_acolhendo_ansiedade);
    }

    public void enterOnFundamentos() {
        clickOn(txt_fundamentos);
    }

    public void enterToolsTab() {
        clickOn(tab_tools);
    }

    public void enterMoreTab() {
        clickOn(tab_more);
    }

    public void scrollToProgramaMinfulness() {
        Utils.scrollToElement("down", txt_mindfulness);
    }
}
