package hooks;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.Augmenter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import utils.CapabilitiesFactory;

import java.io.File;
import java.net.MalformedURLException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class BaseClass {
    public static ThreadLocal<AppiumDriver> driver = new ThreadLocal<>();

    static AppiumDriverLocalService service;
    public static Boolean isAndroid = System.getProperty("platform").toLowerCase() == "android" ? true : false;
    private static Logger log = LoggerFactory.getLogger(BaseClass.class);

    public AppiumDriver getDriver() {
        return driver.get();
    }

    @BeforeMethod
    public void setup() throws MalformedURLException {

        AppiumController.startAppium();

        if (System.getProperty("platform").equalsIgnoreCase("android")) {
            if (System.getProperty("local").equalsIgnoreCase("local")) {
                CapabilitiesFactory.setCapabilitiesAndroid();
            } else {
                CapabilitiesFactory.setCapabilitiesAndroidDF();
            }
        } else {
            if (System.getProperty("local").equalsIgnoreCase("local")) {
                CapabilitiesFactory.setCapabilitiesIOS();
            } else {
                CapabilitiesFactory.setCapabilitiesIOSDF();
            }
        }

        driver.get().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        log.info("--------------------------------------------------------");
        log.info("----------------------Test Start------------------------");
        log.info("--------------------------------------------------------");
    }

    @AfterTest
    public void teardown() {
        driver.get().quit();
        service.stop();

        log.info("--------------------------------------------------------");
        log.info("----------------------Test Finish-----------------------");
        log.info("--------------------------------------------------------");
    }

    public static void captureScreenshot() {
        String name = new Date().toString();
        String screenshotDirectory = System.getProperty("appium.screenshots.dir", System.getProperty("java.io.tmpdir", ""));
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        screenshot.renameTo(new File(screenshotDirectory, String.format("%s.png", name)));
        log.info(screenshot.getPath());
    }

    public static void takeScreenshotAndSave() {
        String imagesLocation = "target/surefire-reports/screenshot/";
        new File(imagesLocation).mkdirs();
        String filename = imagesLocation + "device.jpg";

        try {
            Thread.sleep(500);
            WebDriver augmentedDriver = new Augmenter().augment(driver.get());
            File scrFile = ((TakesScreenshot) augmentedDriver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File(filename), true);
        } catch (Exception e) {
            log.error("Error capturing screen shot of test failure.");
            File f = new File(filename);
            f.delete();
        }
    }

}
