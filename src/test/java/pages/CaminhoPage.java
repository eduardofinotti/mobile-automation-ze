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

public class CaminhoPage extends Utils {

    private AppiumDriver driver;
    private static Logger log = LoggerFactory.getLogger(CaminhoPage.class);


    public CaminhoPage(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "ivIconWay1")
    @iOSXCUITFindBy(accessibility = "path img2")
    public static MobileElement day_1;

    @AndroidFindBy(id = "ivRightIcon")
    @iOSXCUITFindBy(accessibility = "path img6")
    public static MobileElement btn_day_free;

    @AndroidFindBy(id = "ivPlay")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell[1]")
    public static MobileElement play_1;

    @AndroidFindBy(id = "ivPlay")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Lojong\"]/XCUIElementTypeWindow[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeButton[3]")
    public static MobileElement btn_next_audio;

    @AndroidFindBy(id = "ivPlay")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"CONCLUIR\"]")
    public static MobileElement btn_finish;

    public void playAudio1() {
        clickOn(play_1);
    }

    public void enterDay1() {
        clickOn(day_1);
    }

    public void completeDay() throws InterruptedException {
        for (int i = 0; i < 9; i++) {
            if (isElementDisplayed(btn_day_free)) {
                clickOn(btn_day_free);
                clickOn(play_1);

                CommonPage commonPage = new CommonPage(driver);
                commonPage.startPratice();
                PlayerPage playerPage = new PlayerPage(driver);

                for (int j = 0; j < 3; j++) {

                    while (isElementDisplayed(playerPage.btn_skip_audio)) {
                        try {
                            clickOn(playerPage.btn_skip_audio);
                        } catch (Exception e) {
                            log.warn("O elemento Next Audio não está mais presente.");
                        }
                    }

                    Thread.sleep(10000);

                    if (isElementDisplayed(btn_next_audio)) {
                        clickOn(btn_next_audio);
                    } else {
                        clickOn(btn_finish);
                        Utils.backScreenIOS();
                        break;
                    }
                }

            }
        }
    }
}
