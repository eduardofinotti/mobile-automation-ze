package pages;

import components.CommonComponents;
import components.CongratsComponents;
import org.openqa.selenium.By;
import tests.BaseClass;

public class CongratsPage extends BaseClass {

    public static void nextPratice() {
        if (waitForElementDisplayed(By.id(CongratsComponents.idBtnNext))) {
            click(By.id(CongratsComponents.idBtnNext), "[NEXT PRACTICE]", 10);
        }
    }
    public static void finishPratice() {
        if (waitForElementDisplayed(By.id(CongratsComponents.idBtnCancel))) {
            click(By.id(CongratsComponents.idBtnCancel), "[FINISH PRACTICE]", 10);
        }
    }


}
