package utils;

import hooks.BaseClass;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;
import java.util.Calendar;

public class Utils extends BaseClass {

    private static Logger log = LoggerFactory.getLogger(BaseClass.class);

    public static boolean waitElementBePresent(MobileElement targetResourceId, int timeLimitInSeconds) {
        try {
            FluentWait wait = new FluentWait(BaseClass.driver.get()).withTimeout(Duration.ofSeconds(timeLimitInSeconds))
                    .pollingEvery(Duration.ofMillis(100))
                    .ignoring(NoSuchElementException.class, StaleElementReferenceException.class)
                    .ignoring(TimeoutException.class);
            wait.until(ExpectedConditions.elementToBeClickable(targetResourceId));
            return true;
        } catch (Exception e) {
            log.info("ERRO: " + e.getLocalizedMessage());
            return false;
        }
    }

    public static void scrollToElement(String direction, MobileElement element) {
        Double[] array = new Double[3];
        int scrollMaximum = 2;
        switch (direction) {
            case "down long":
                array = new Double[]{0.9, 0.1, 0.4};
                scrollMaximum = 10;
                break;
            case "down":
                array = new Double[]{0.7, 0.3, 0.5};
                break;
            case "up":
                array = new Double[]{0.3, 0.7, 0.4};
                break;
            case "up long":
                array = new Double[]{0.2, 0.9, 0.4};
                break;
        }

        int scrollsDone = 0;
        while (!isElementDisplayed(element) && scrollsDone < scrollMaximum) {
            verticalSwipeByPercentages(array[0], array[1], array[2]);
            scrollsDone++;
        }
    }

    public static boolean isElementDisplayed(MobileElement element) {
        try {
            return element.isDisplayed();
        } catch (NoSuchElementException | StaleElementReferenceException e) {
            log.info("ERRO: " + e.getMessage());
            return false;
        }
    }

    public static void scroll(String direction) {
        switch (direction) {
            case "down long":
                verticalSwipeByPercentages(0.9, 0.1, 0.5);
                break;
            case "down":
                verticalSwipeByPercentages(0.7, 0.3, 0.5);
                break;
            case "up":
                verticalSwipeByPercentages(0.2, 0.8, 0.4);
            case "up long":
                verticalSwipeByPercentages(0.2, 0.9, 0.4);
                break;
        }
    }

    public static void verticalSwipeByPercentages(double startPercentage, double endPercentage, double anchorPercentage) {
        Dimension size = driver.get().manage().window().getSize();
        int anchor = (int) (size.width * anchorPercentage);
        int startPoint = (int) (size.height * startPercentage);
        int endPoint = (int) (size.height * endPercentage);

        new TouchAction(driver.get())
                .longPress(PointOption.point(anchor, startPoint))
                .moveTo(PointOption.point(anchor, endPoint))
                .release()
                .perform();
    }

    public static void clickOn(MobileElement element) {
        Utils.waitElementBePresent(element, 5);
        element.click();
        log.info("[CLICK ON " + element + "]");
    }

    public static String getText(MobileElement element) {
        Utils.waitElementBePresent(element, 5);
        try {
            return element.getAttribute("text");
        } catch (Exception e) {
            return element.getAttribute("label");

        }
    }

    public static void fillField(MobileElement field, String value) {
        Utils.waitElementBePresent(field, 5);
        field.click();
        field.sendKeys(value);
        log.info("[FILL FIELD " + field + " WITH <" + value + ">]");
    }

    public static String getNewDate() {
        Calendar calendar = Calendar.getInstance();
        String data = calendar.get(Calendar.DAY_OF_MONTH) + "/" + (calendar.get(Calendar.MONTH) + 1);
        return data;
    }
}
