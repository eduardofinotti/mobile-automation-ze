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
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import utils.CapabilitiesFactory;
import utils.ResultsAPIRequests;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class BaseClass {

    private static final Logger log = LoggerFactory.getLogger(BaseClass.class);

    public static ThreadLocal<AppiumDriver> driver = new ThreadLocal<>();

    public static String session_id = null;

    public static String device_run = null;
    public static String local_run = null;
    public static String version_run = null;
    public static String platform_run = null;

    static AppiumDriverLocalService service;

    public AppiumDriver getDriver() {
        return driver.get();
    }

    @BeforeMethod
    public void setup() {

//        AppiumController.startAppium();

//        *** EXEMPLOS DE DADOS ***
//
//        device_run = "iPhone 11 Pro Max";
//        version_run = "13.5";
//        local_run = "local";
//        platform_run = "ios";
//
//        device_run = "pixel2";
//        version_run = "11.0";
//        local_run = "local";
//        platform_run = "Android";

        local_run = System.getProperty("local");
        device_run = System.getProperty("device");
        version_run = System.getProperty("version");
        platform_run = System.getProperty("platform");

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

        session_id = String.valueOf(getDriver().getSessionId());

        driver.get().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        log.info("--------------------------------------------------------");
        log.info("----------------------Test Start------------------------");
        log.info("--------------------------------------------------------");
    }

    @AfterMethod
    public void afterMethod(ITestResult result) {
        try {
            if (result.getStatus() == ITestResult.FAILURE) {
                String sessionId = String.valueOf(driver.get().getSessionId());
                ResultsAPIRequests.sendTestStatusToBrowserStack(result.getThrowable().toString(), "failed", sessionId);
            } else if (result.getStatus() == ITestResult.SKIP) {
                String sessionId = String.valueOf(driver.get().getSessionId());
                ResultsAPIRequests.sendTestStatusToBrowserStack("failed", result.getThrowable().toString(), sessionId);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @AfterTest
    public void teardown() {
        driver.get().quit();
//        service.stop();

        log.info("--------------------------------------------------------");
        log.info("----------------------Test Finish-----------------------");
        log.info("--------------------------------------------------------");
    }

    public static void takeScreenshotAndSave(String screen) {
        Capabilities cap = driver.get().getCapabilities();

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

}
