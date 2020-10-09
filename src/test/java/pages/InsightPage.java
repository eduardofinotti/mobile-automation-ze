package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;
import hooks.BaseClass;
import utils.Utils;

public class InsightPage extends Utils {

    public InsightPage() {
        AppiumDriver driver = new BaseClass().driver.get();
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath = "//*[contains(@text,'O QUE É EQUILÍBRIO COGNITIVO?')]")
    @iOSXCUITFindBy(id = "Permitir")
    public static MobileElement textFinalVideo;

    @AndroidFindBy(xpath = "//*[contains(@text,'FELICIDADE GENUÍNA')]")
    @iOSXCUITFindBy(id = "Permitir")
    public static MobileElement textTopVideo;

    @AndroidFindBy(xpath = "//android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.TextView[1]")
    @iOSXCUITFindBy(id = "Permitir")
    public static MobileElement textVideos;

    @AndroidFindBy(xpath = "//android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.TextView[2]")
    @iOSXCUITFindBy(id = "Permitir")
    public static MobileElement textArtigos;

    @AndroidFindBy(xpath = "//android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.TextView[3]")
    @iOSXCUITFindBy(id = "Permitir")
    public static MobileElement textCitacoes;

    @AndroidFindBy(xpath = "//*[contains(@text,'O CORPO EQUILIBRADO E O CAMINHO DO MEIO')]")
    @iOSXCUITFindBy(id = "Permitir")
    public static MobileElement textFinalArtigos;

    @AndroidFindBy(xpath = "//*[contains(@text,'UMA ABORDAGEM MINDFUL DIANTE DO CORONAVÍRUS')]")
    @iOSXCUITFindBy(id = "Permitir")
    public static MobileElement textTopArtigos;

    @AndroidFindBy(xpath = "//*[contains(@text,'Phakchok Rinpoche')]")
    @iOSXCUITFindBy(id = "Permitir")
    public static MobileElement textTopCitacoes;

    @AndroidFindBy(xpath = "//*[contains(@text,'Jon Kabat-Zinn')]")
    @iOSXCUITFindBy(id = "Permitir")
    public static MobileElement textFinalCitacoes;
}
