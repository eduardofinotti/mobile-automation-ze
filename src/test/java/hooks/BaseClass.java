package hooks;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.Augmenter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import utils.CapabilitiesFactory;

import java.io.File;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class BaseClass {

    private static final Logger log = LoggerFactory.getLogger(BaseClass.class);

    public static ThreadLocal<AppiumDriver> driver = new ThreadLocal<>();

    public static String device_run = null;
    public static String local_run = null;
    public static String version_run = null;
    public static String platform_run = null;

    static AppiumDriverLocalService service;

    public static void captureScreenshot() {
        String name = new Date().toString();
        String screenshotDirectory = System.getProperty("appium.screenshots.dir", System.getProperty("java.io.tmpdir", ""));
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        screenshot.renameTo(new File(screenshotDirectory, String.format("%s.png", name)));
        log.info(screenshot.getPath());
    }

    public static void takeScreenshotAndSave(String screen) {
        Capabilities cap = driver.get().getCapabilities();
//        String device = (String) driver.get().getCapabilities().getCapability("deviceName");

        String imagesLocation = "target/screenshots/" + device_run + '/';
        new File(imagesLocation).mkdirs();
        String filename = imagesLocation + screen + ".jpg";

        try {
            Thread.sleep(2000);
            WebDriver augmentedDriver = new Augmenter().augment(driver.get());
            File scrFile = ((TakesScreenshot) augmentedDriver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File(filename), true);
        } catch (Exception e) {
            log.error("Error capturing screen shot of test failure.");
            File f = new File(filename);
            f.delete();
        }
    }

    public AppiumDriver getDriver() {
        return driver.get();
    }

    @BeforeMethod
    @Parameters({"device", "osVersion", "local", "platform"})
    public void setup(String device, String osVersion, String local, String platform) {

//        AppiumController.startAppium();

        local_run = local;
        device_run = device;
        version_run = osVersion;
        platform_run = platform;

        if (platform_run.equalsIgnoreCase("android")) {
            if (local_run.equalsIgnoreCase("local")) {
                CapabilitiesFactory.setCapabilitiesAndroid();
            } else {
                CapabilitiesFactory.setCapabilitiesAndroidDF();
            }
        } else {
            if (local_run.equalsIgnoreCase("local")) {
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
//        service.stop();

        log.info("--------------------------------------------------------");
        log.info("----------------------Test Finish-----------------------");
        log.info("--------------------------------------------------------");
    }

}
