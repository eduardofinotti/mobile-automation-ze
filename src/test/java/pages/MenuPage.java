package pages;

import components.InsightComponents;
import components.MenuComponents;
import tests.BaseClass;

public class MenuPage extends BaseClass {

    public static void clickPurchase() {
        clickByText(MenuComponents.textMenuPurchase, "[CLICK PURCHASE]", 15);
        captureScreenshot();
    }

}
