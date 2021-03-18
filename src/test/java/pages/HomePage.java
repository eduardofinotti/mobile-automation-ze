package pages;

import hooks.BaseClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import utils.Utils;

public class HomePage extends Utils {

    private AppiumDriver driver;
    private static Logger log = LoggerFactory.getLogger(HomePage.class);

    public HomePage(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"open-search\"]/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText")
    @iOSXCUITFindBy(xpath = "(//*[@name=\"edit-profile \uF35C menu-edit-address open-search\"])[1]")
    public static MobileElement enter_choose_products;

    @AndroidFindBy(accessibility = "search-input")
    @iOSXCUITFindBy(accessibility = "RNE__Input__text-input")
    public static MobileElement field_search_product;

    @AndroidFindBy(xpath = "(//android.view.ViewGroup[@content-desc=\"default-product-card\"])[1]")
    @iOSXCUITFindBy(xpath = "(//*[@name=\"default-product-card\"])[2]")
    public static MobileElement first_product_search;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"menu-edit-address\"]/android.widget.TextView[2]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"menu-edit-address\"]")
    public static MobileElement address_selected;

    public void checkHome() throws InterruptedException {
        AddressPage addressPage = new AddressPage(driver);
        if (!isElementDisplayed(addressPage.option_address_saved) &&
                (isElementDisplayed(addressPage.field_search_address))) {
            addressPage.registerAddress();
        }
        Assert.assertTrue(isElementDisplayed(enter_choose_products));
    }

    public void accessSearchProducts() {
        clickOn(enter_choose_products);
    }

    public void checkAddressHome() {
        while (getText(address_selected).contains("carregando")) {
            log.info("Endereço ainda não carregado na home.");
        }
        if (BaseClass.platform_run.equalsIgnoreCase("ios")) {
            log.info("#TODO");
        } else {
            Assert.assertEquals(getText(address_selected), "Avenida Paulista, 199 Bela Vista, São Paulo - SP");
        }
    }

    public void searchProduct() {
        fillField(field_search_product, "skol");
        clickOn(first_product_search);
    }
}
