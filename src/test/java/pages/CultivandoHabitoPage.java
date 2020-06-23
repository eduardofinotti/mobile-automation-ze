package pages;


import components.CommonComponents;
import components.CultivandoHabitoComponents;
import org.openqa.selenium.By;
import tests.BaseClass;

public abstract class CultivandoHabitoPage extends BaseClass {

    public static void clickDayOneCultivandoHabito() {
        log("[CLICK DAY ONE]");
        scrollToTextClickHorizontal(CultivandoHabitoComponents.textCultivandoHabitoDayOne);
        captureScreenshot();
    }


    public static void clickStartDayOneCultivandoHabito() {
        if (waitForElementDisplayed(By.id(CultivandoHabitoComponents.startPractice))) {
            click(By.id(CultivandoHabitoComponents.startPractice), "[START DAY ONE]", 10);
            captureScreenshot();
        }
    }

    public static void skeepAudioDayOne() {
        PlayerPage.skipAudio();
    }

    public static void closePlayerCultivandoHabito() {
        PlayerPage.closePalyer();
        PlayerPage.confirmClosePalyer();
    }

    public static void closeCultivandoHabito() {
        if (waitForElementDisplayed(By.id(CommonComponents.idCloseBtn))) {
            click(By.id(CommonComponents.idCloseBtn), "[CLOSE CULTIVANDO HÁBITO]", 5);
            captureScreenshot();
        }
    }

}
