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

public class ProductPage extends Utils {

    private AppiumDriver driver;
    private static Logger log = LoggerFactory.getLogger(ProductPage.class);

    public ProductPage(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"plus-button\"]/android.widget.TextView")
    @iOSXCUITFindBy(accessibility = "add-1-unit-button")
    public static MobileElement quantity_more;

    @AndroidFindBy(accessibility = "add-to-checkout")
    @iOSXCUITFindBy(xpath = "(//*[@name=\"add-to-checkout\"])[2]")
    public static MobileElement btn_add_in_bag;

    @AndroidFindBy(accessibility = "place-an-order")
    @iOSXCUITFindBy(xpath = "(//*[@name=\"place-an-order\"])[3]")
    public static MobileElement btn_see_bag;

    @AndroidFindBy(accessibility = "primary-modal-button\n")
    @iOSXCUITFindBy(xpath = "(//*[@name=\"primary-modal-button\"])[3]")
    public static MobileElement btn_clean_bag;

    public void addProductQuantity() {
        for (int i = 0; i < 9; i++) {
            clickOn(quantity_more);
        }
    }

    public void addInBag() {
        clickOn(btn_add_in_bag);
        if (isElementDisplayed(btn_clean_bag)) {
            clickOn(btn_clean_bag);
        }
        clickOn(btn_see_bag);
    }

}
