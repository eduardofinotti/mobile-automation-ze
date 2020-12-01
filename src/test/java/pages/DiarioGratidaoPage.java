package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.Utils;

public class DiarioGratidaoPage extends Utils {

    private AppiumDriver driver;

    public DiarioGratidaoPage(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

//    @AndroidFindBy(id = "llAddPost")
    @AndroidFindBy(id = "fab")
    @iOSXCUITFindBy(accessibility = "ic plus")
    public static MobileElement btn_add_post;

    @AndroidFindBy(id = "edText")
    @iOSXCUITFindBy(iOSNsPredicate = "value == \"Sou grata ou grato por…\"")
    public static MobileElement field_add_post;

    @AndroidFindBy(id = "llSaveBgOn")
    @iOSXCUITFindBy(iOSNsPredicate = "label == \"SALVAR\" AND name == \"SALVAR\" AND value == \"SALVAR\"")
    public static MobileElement btn_save_post;

    @AndroidFindBy(id = "tvText")
    @iOSXCUITFindBy(accessibility = "Minha Gratidão.")
    public static MobileElement txt_diario_gratidao;

    @AndroidFindBy(id = "llOptions")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"ic option\"]")
    public static MobileElement btn_options;

    @AndroidFindBy(xpath = "(//android.widget.LinearLayout[@content-desc=\"Opções\"])[1]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"ic option\"])[1]")
    public static MobileElement btn_options1;

    @AndroidFindBy(xpath = "//*[contains(@text,'Excluir')]")
    @iOSXCUITFindBy(accessibility = "Excluir")
    public static MobileElement btn_delete;

    @AndroidFindBy(id = "btCamera")
    @iOSXCUITFindBy(iOSNsPredicate = "label == \"SIM\" AND name == \"SIM\" AND type == \"XCUIElementTypeButton\"")
    public static MobileElement btn_confirm_delete;

    @AndroidFindBy(id = "btnNo")
    @iOSXCUITFindBy(iOSNsPredicate = "label == \"NÃO\" AND name == \"NÃO\" AND type == \"XCUIElementTypeButton\"")
    public static MobileElement btn_not_confirm_delete;

    public void enterCreatePost() {
        clickOn(btn_add_post);
    }

    public void writePost() {
        fillField(field_add_post, "Minha Gratidão.");
    }

    public void savePost() {
        clickOn(btn_save_post);
    }

    public void checkDiarioGratidao() {
        String title_register = getText(txt_diario_gratidao);
        Assert.assertEquals(title_register, "Minha Gratidão.");
    }


    public void cleanDiarioGratidao() throws InterruptedException {
        while (isElementDisplayed(txt_diario_gratidao)){
            try{
                clickOn(btn_options);
            }catch (Exception e) {
                clickOn(btn_options1);
            }
            Thread.sleep(1000);
            clickOn(btn_delete);
            clickOn(btn_confirm_delete);
            Thread.sleep(1000);
        }
    }
}