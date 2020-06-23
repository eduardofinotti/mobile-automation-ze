package pages;


import components.CommonComponents;
import components.FundamentosComponents;
import components.PracticesComponents;
import org.openqa.selenium.By;
import tests.BaseClass;

public abstract class FundamentoPage extends BaseClass {

    public static void scrollScreenFundamentos(){
        log("[SCROLL SCREEN FUNDAMENTOS]");
        scrollToId(FundamentosComponents.idLastDay);
        captureScreenshot();
        scrollToId(FundamentosComponents.idDayOne);
        captureScreenshot();
    }

    public static void clickDayOneFundamentos() {
        log("[CLICK DAY ONE FUNDAMENTOS]");
        if (waitForElementDisplayed(By.id(FundamentosComponents.idDayOne))) {
            click(By.id(FundamentosComponents.idDayOne), "[START DAY ONE FUNDAMENTOS]", 5);
            captureScreenshot();
        }
    }

    public static void clickStartDayOneFundamentosPlay1() {
        if (waitForElementDisplayed(By.id(CommonComponents.idDayPlay1))) {
            click(By.id(CommonComponents.idDayPlay1), "[START DAY ONE FUNDAMENTOS 1]", 5);
            captureScreenshot();
        }
    }

    public static void clickStartDayOneFundamentos() {
        if (waitForElementDisplayed(By.id(CommonComponents.idstartPracticePremmium))) {
            click(By.id(CommonComponents.idstartPracticePremmium), "[START DAY ONE FUNDAMENTOS]", 10);
            captureScreenshot();
        }
    }

    public static void skipAudioDayOne1() {
        PlayerPage.skipAudio();
        PlayerPage.skipAudio();
        PlayerPage.skipAudio();
        PlayerPage.skipAudio();
        PlayerPage.skipAudio();
        PlayerPage.skipAudio();
        pause(60);
    }
    public static void nextPracticeFundamentos() {
        CongratsPage.nextPratice();
    }
    public static void finishPracticeFundamentos() {
        captureScreenshot();
        CongratsPage.finishPratice();
    }


    public static void closePlayerFundamentos() {
        PlayerPage.closePalyer();
        PlayerPage.confirmClosePalyer();
    }

    public static void closeFundamentos() {
        if (waitForElementDisplayed(By.id(CommonComponents.idCloseBtn))) {
            click(By.id(CommonComponents.idCloseBtn), "[CLOSE FUNDAMENTOS]", 10);
            captureScreenshot();
        }
    }
}
