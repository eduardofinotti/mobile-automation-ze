package hooks;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class BaseClass {

    static AppiumDriverLocalService service;
    public static AppiumDriver driver;

    public static Boolean isAndroid = System.getProperty("platform").toLowerCase() == "android" ? true : false;

    private static Logger log = LoggerFactory.getLogger(BaseClass.class);

    @BeforeTest
    public void setup() {

        AppiumController.startAppium();

        if (System.getProperty("platform").equalsIgnoreCase("android")) {
            setCapabilitiesAndroid();
        } else {
            setCapabilitiesIOS();
        }

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        log.info("--------------------------------------------------------");
        log.info("----------------------Test Start------------------------");
        log.info("--------------------------------------------------------");
    }

    private void setCapabilitiesIOS() {
        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 11 Pro");
            capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
            capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13.5");
            capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
            capabilities.setCapability(MobileCapabilityType.APP, "/Users/eduardofinotti/Desktop/Lojong.app");
            capabilities.setCapability(MobileCapabilityType.NO_RESET, false);
            capabilities.setCapability("useNewWDA", true);

            driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void setCapabilitiesAndroid() {
        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();

            ////// // LOCAL
            capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "pixel");//note 3- 3204a822185f2173// s3-4df1b3c606d75f11//android//ZY3223FG76
            capabilities.setCapability("appPackage", "br.com.lojong");
            capabilities.setCapability("appActivity", "br.com.lojong.activity.SplashActivity");
            capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
            capabilities.setCapability(MobileCapabilityType.APP, "/Users/eduardofinotti/Desktop/lojong.apk");
            capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
            capabilities.setCapability("platformVersion", "10.0");

            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

//            // KOBITON
//            String kobitonServerUrl = "https://unisollus:821a4d4e-b208-4452-bf57-83ba9df8568e@api.kobiton.com/wd/hub";
//
//            DesiredCapabilities capabilities = new DesiredCapabilities();
//            capabilities.setCapability("appPackage", "br.com.lojong");
//            capabilities.setCapability("appActivity", "br.com.lojong.activity.SplashActivity");
//            capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
//            capabilities.setCapability("sessionName", "Automation test session");
//            capabilities.setCapability("sessionDescription", "");
//            capabilities.setCapability("deviceOrientation", "portrait");
//            capabilities.setCapability("captureScreenshots", true);
//            capabilities.setCapability("app", "kobiton-store:88155");
//            capabilities.setCapability("deviceGroup", "KOBITON");
//            capabilities.setCapability("deviceName", "Galaxy Tab S5e");
//            capabilities.setCapability("platformVersion", "9");
//            capabilities.setCapability("platformName", "Android");
//            capabilities.setCapability(MobileCapabilityType.FULL_RESET, true);
//            capabilities.setCapability(MobileCapabilityType.NO_RESET, false);
//
//            driver = new AndroidDriver(new URL(kobitonServerUrl), capabilities);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @AfterTest
    public void teardown() {
        log.info("--------------------------------------------------------");
        log.info("----------------------Test Finish-----------------------");
        log.info("--------------------------------------------------------");

        driver.quit();
        service.stop();
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
        String filename = imagesLocation + "screenshot.jpg";

        try {
            Thread.sleep(500);
            WebDriver augmentedDriver = new Augmenter().augment(driver);
            File scrFile = ((TakesScreenshot) augmentedDriver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File(filename), true);
        } catch (Exception e) {
            log.error("Error capturing screen shot of test failure.");
            File f = new File(filename);
            f.delete();
        }
    }

}
