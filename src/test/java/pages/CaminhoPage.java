package pages;

import components.CaminhoComponents;
import components.CommonComponents;
import components.CultivandoHabitoComponents;
import org.openqa.selenium.By;
import tests.BaseClass;

public class CaminhoPage extends BaseClass {

    private CaminhoPage(){};

    public static void clickDayOneCaminho() {
        log("[CLICK DAY ONE CAMINHO]");
        if (waitForElementDisplayed(By.id(CaminhoComponents.idDayOne))) {
            click(By.id(CaminhoComponents.idDayOne), "[START DAY ONE CAMINHO]", 5);
            captureScreenshot();
        }
    }

    public static void clickStartDayOneCaminhoPlay1() {
        if (waitForElementDisplayed(By.id(CaminhoComponents.idDayPlay1))) {
            click(By.id(CaminhoComponents.idDayPlay1), "[START DAY ONE CAMINHO 1]", 5);
            captureScreenshot();
        }
    }

    public static void clickStartDayOneCaminho() {
        if (waitForElementDisplayed(By.id(CommonComponents.idstartPracticePremmium))) {
            click(By.id(CommonComponents.idstartPracticePremmium), "[START DAY ONE CAMINHO]", 10);
            captureScreenshot();
        }
    }

    public static void closePlayerCaminho() {
        PlayerPage.closePalyer();
        PlayerPage.confirmClosePalyer();
    }

    public static void closeCaminho() {
        if (waitForElementDisplayed(By.id(CommonComponents.idCloseBtn))) {
            click(By.id(CommonComponents.idCloseBtn), "[CLOSE CAMINHO]", 10);
            captureScreenshot();
        }
    }
}
