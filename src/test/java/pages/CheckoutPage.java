package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.Utils;

public class CheckoutPage extends Utils {

    private final AppiumDriver driver;

    public CheckoutPage(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(accessibility = "checkout-action-button")
    @iOSXCUITFindBy(xpath = "(//*[@name=\"checkout-action-button\"])[3]")
    public static MobileElement btn_select_payment_form;

    @AndroidFindBy(accessibility = "payment-method-CASH")
    @iOSXCUITFindBy(xpath = "(//*[@name=\"payment-method-CASH\"])")
    public static MobileElement option_money;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"checkbox-change-is-not-required\"]/android.view.ViewGroup/android.view.ViewGroup")
    @iOSXCUITFindBy(accessibility = "checkbox-change-is-not-required")
    public static MobileElement option_without_change;

    @AndroidFindBy(accessibility = "checkout-payment-action-button")
    @iOSXCUITFindBy(xpath = "(//*[@name=\"checkout-payment-action-button\"])[3]")
    public static MobileElement btn_finish_order;

    @AndroidFindBy(accessibility = "checkout-payment-confirmation-modal-action-button")
    @iOSXCUITFindBy(xpath = "(//*[@name=\"checkout-payment-confirmation-modal-action-button\"])[2]")
    public static MobileElement btn_confirm_order;

    public static void selectPaymentForm() {
        scrollToElement("down long", btn_select_payment_form);
        if (isElementDisplayed(btn_select_payment_form)) {
            clickOn(btn_select_payment_form);
        }
    }

    public static void selectMoney() {
        clickOn(option_money);
    }

    public static void selectWithoutChange() {
        waitElementBePresent(option_without_change, 6);
        clickOn(option_without_change);
    }

    public static void finishOrder() {
        clickOn(btn_finish_order);
    }

    public static void confirmOrder() {
        Assert.assertTrue(isElementDisplayed(btn_confirm_order));
    }
}