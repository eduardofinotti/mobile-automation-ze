package pages;

import components.PlayerComponents;
import org.openqa.selenium.By;
import tests.BaseClass;


public abstract class PlayerPage extends BaseClass {

    public static void skipAudio(){
        click(By.id(PlayerComponents.idBtnSkipAudio), "[CLOSE PLAYER]", 1);
        log("SKIP");
    }

    public static void closePalyer() {
        if (waitForElementDisplayed(By.id(PlayerComponents.idCloseBtn))) {
            click(By.id(PlayerComponents.idCloseBtn), "[CLOSE PLAYER]", 5);
        }
    }
    public static void confirmClosePalyer() {
        if (waitForElementDisplayed(By.id(PlayerComponents.idYesCloseBtn))) {
            click(By.id(PlayerComponents.idYesCloseBtn), "[CONFIRM CLOSE PLAYER]", 5);
        }
    }
}
