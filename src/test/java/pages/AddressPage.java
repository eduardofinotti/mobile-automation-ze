package pages;

import hooks.BaseClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Utils;

public class AddressPage extends Utils {

    private AppiumDriver driver;

    public AddressPage(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(accessibility = "address-card-HOME")
    @iOSXCUITFindBy(accessibility = "icon-card")
    public static MobileElement option_address_saved;

    @AndroidFindBy(accessibility = "continue")
    @iOSXCUITFindBy(xpath = "(//*[@name=\"continue\"])[3]")
    public static MobileElement btn_continue_address;

    @AndroidFindBy(accessibility = "see-products")
    @iOSXCUITFindBy(xpath = "(//*[@name=\"see-products\"])[3]")
    public static MobileElement btn_see_products;

    @AndroidFindBy(accessibility = "address input")
    @iOSXCUITFindBy(accessibility = "RNE__Input__text-input")
    public static MobileElement field_search_address;

    @AndroidFindBy(xpath = "(//android.view.ViewGroup[@content-desc=\"address-card-auto-complete\"])[1]")
    @iOSXCUITFindBy(xpath = "(//*[@name=\"icon-card\"])[1]")
    public static MobileElement option_first_address;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"not-own-complemnt\"]/android.widget.TextView")
    @iOSXCUITFindBy(accessibility = "not-own-complemnt")
    public static MobileElement option_without_complement;

    @AndroidFindBy(accessibility = "home-button")
    @iOSXCUITFindBy(accessibility = "home-button")
    public static MobileElement option_house;

    @AndroidFindBy(accessibility = "continue")
    @iOSXCUITFindBy(xpath = "(//*[@name=\"continue\"])[3]")
    public static MobileElement btn_continue;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"header-message\"]/android.widget.TextView")
    public static MobileElement message_select_delivery;

    public void chooseAddress() throws InterruptedException {
        if (isElementDisplayed(option_address_saved)) {
            clickOn(option_address_saved);
            clickOn(btn_continue_address);
            clickSeeProducts();
            if (BaseClass.platform_run.equalsIgnoreCase("Android")) {
                if(isElementDisplayed(message_select_delivery)){
                    clickSeeProducts();
                }
            }
        } else {
            registerAddress();
        }
    }

    public void registerAddress() throws InterruptedException {
        fillField(field_search_address, "Avenida paulista, 199");
        clickOn(option_first_address);
        waitElementBePresent(option_without_complement, 10);
        clickOn(option_without_complement);
        clickOn(option_house);
        clickOn(btn_continue);
        clickSeeProducts();
    }

    private void clickSeeProducts() throws InterruptedException {
        Thread.sleep(5000);
        clickOn(btn_see_products);
    }

}
