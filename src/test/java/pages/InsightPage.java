package pages;

import hooks.BaseClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Utils;

public class InsightPage extends Utils {

    private AppiumDriver driver;

    public InsightPage(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath = "//*[contains(@text,'O QUE É EQUILÍBRIO COGNITIVO?')]")
    @iOSXCUITFindBy(accessibility = "O QUE É EQUILÍBRIO COGNITIVO?")
    public static MobileElement txt_final_video;

    @AndroidFindBy(xpath = "//*[contains(@text,'FELICIDADE GENUÍNA')]")
    @iOSXCUITFindBy(accessibility = "FELICIDADE GENUÍNA")
    public static MobileElement txt_top_videos;

    @AndroidFindBy(xpath = "//android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.TextView[2]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"ARTIGOS\"]")
    public static MobileElement tab_artigos;

    @AndroidFindBy(xpath = "//android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.TextView[3]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"CITAÇÕES\"]")
    public static MobileElement tab_citacoes;

    @AndroidFindBy(xpath = "//*[contains(@text,'A SOBREVIVÊNCIA DO MAIS BONDOSO')]")
    @iOSXCUITFindBy(accessibility = "A SOBREVIVÊNCIA DO MAIS BONDOSO")
    public static MobileElement txt_final_artigos;

    @AndroidFindBy(xpath = "//*[contains(@text,'UMA ABORDAGEM MINDFUL DIANTE DO CORONAVÍRUS')]")
    @iOSXCUITFindBy(accessibility = "UMA ABORDAGEM MINDFUL DIANTE DO CORONAVÍRUS")
    public static MobileElement txt_top_artigos;

    @AndroidFindBy(xpath = "//*[contains(@text,'Phakchok Rinpoche')]")
    @iOSXCUITFindBy(accessibility = "Phakchok Rinpoche")
    public static MobileElement txt_top_citacoes;

    @AndroidFindBy(xpath = "//*[contains(@text,'Pema Chodron')]")
    @iOSXCUITFindBy(accessibility = "Pema Chodron")
    public static MobileElement txt_final_citacoes;

    public void scrollToFinalVideoTab() {
        Utils.scrollToElement("down long", txt_final_video);
    }

    public void scrollToTopVideoTab() {
        Utils.scrollToElement("up long", txt_top_videos);
    }

    public void enterArtigosTab() {
        clickOn(tab_artigos);
    }

    public void scrollToFinalArtigosTab() {
        Utils.scrollToElement("down long", txt_final_artigos);
    }

    public void scrollToTopArtigosTab() {
        Utils.scrollToElement("up long", txt_top_artigos);
    }

    public void enterCitacoesTab() {
        clickOn(tab_citacoes);
    }

    public void scrollToFinalCitacoesTab() {
        Utils.scrollToElement("down long", txt_final_citacoes);
    }

    public void scrollToTopCitacoesTab() {
        Utils.scrollToElement("up long", txt_top_citacoes);
    }
}
