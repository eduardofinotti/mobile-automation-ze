package hooks;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.net.URL;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class BaseClass {

    static AppiumDriverLocalService service;
    public static AppiumDriver driver;

    public static Boolean isAndroid = System.getProperty("platform").toLowerCase() == "android" ? true : false;

    private static Logger log = LoggerFactory.getLogger(BaseClass.class);

    @BeforeTest
    public void setup() {

        AppiumController.startAppium();

        if (isAndroid) {
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
            capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 11");
            capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
            capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13.1");
            capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
            capabilities.setCapability(MobileCapabilityType.APP, "/Users/eduardo.finotti/Desktop/Lojong.app");
            capabilities.setCapability(MobileCapabilityType.NO_RESET, false);

            driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void setCapabilitiesAndroid() {
        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();

            // LOCAL
            capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Google Pixel 2");//note 3- 3204a822185f2173// s3-4df1b3c606d75f11//android//ZY3223FG76
            capabilities.setCapability("appPackage", "br.com.lojong");
            capabilities.setCapability("appActivity", "br.com.lojong.activity.SplashActivity");
            capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
            capabilities.setCapability(MobileCapabilityType.APP, "/Users/eduardo.finotti/Desktop/app-universal-release.apk");
            capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);

            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

            // KOBITON
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
//            capabilities.setCapability("app", "kobiton-store:85226");
//            capabilities.setCapability("deviceGroup", "KOBITON");
//            capabilities.setCapability("deviceName", "Galaxy Note10+");
//            capabilities.setCapability("platformVersion", "10");
//            capabilities.setCapability("platformName", "Android");
//
//            driver = new AndroidDriver(new URL(kobitonServerUrl), capabilities);

            // BROWSERSTACK
//            final String USERNAME = "eduardofinotti5";
//            final String AUTOMATE_KEY = "Zyai6JV9RzfY5uJhqneb";
//            final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
//
//            capabilities.setCapability("deviceName", "Google Pixel 3");
//            capabilities.setCapability("realMobile", "true");
//            capabilities.setCapability("platformVersion", "9.0");
//            capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9.0");
//            capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
//            capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
//            capabilities.setCapability("name", "Finotti");
//            capabilities.setCapability("app", "bs://42618c32517c7b7d3b97f3aa9404c4a316521f56");
//            capabilities.setCapability("build", "Buld Finotti");
//            capabilities.setCapability("project", "Lojong App");
//            capabilities.setCapability("browserstack.appium_version", "1.17.0");
//
//            driver = new AndroidDriver(new URL(URL), capabilities);

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

}
