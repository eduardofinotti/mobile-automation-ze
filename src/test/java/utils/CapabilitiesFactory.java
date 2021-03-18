package utils;

import hooks.BaseClass;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class CapabilitiesFactory extends BaseClass {

    public static void setCapabilitiesIOSDF() {
        try {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("app", "");
            caps.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.IOS);
            caps.setCapability("platform", MobilePlatform.IOS);
            caps.setCapability("device", BaseClass.device_run);
            caps.setCapability("os_version", BaseClass.version_run);
            caps.setCapability("project", "[iOS] Automation Testes - Ze Delivery");
            caps.setCapability("build", "Ze iOS - " + Utils.getNewDate());
            caps.setCapability("name", "Test Automation iOS");
            caps.setCapability("automationName", "XCUITest");
            caps.setCapability("real_mobile", true);
            caps.setCapability("noReset", false);
            caps.setCapability("language", "pt");
            caps.setCapability("locale", "BR");

            BaseClass.driver.set(new IOSDriver<>(new URL("https://user:id@hub-cloud.browserstack.com/wd/hub"), caps));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void setCapabilitiesIOS() {
        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, BaseClass.device_run);
            capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
            capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, BaseClass.version_run);
            capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
            capabilities.setCapability(MobileCapabilityType.NO_RESET, false);
            capabilities.setCapability("useNewWDA", false);
            capabilities.setCapability("noReset", false);
            capabilities.setCapability(MobileCapabilityType.APP, "/Users/eduardofinotti/Desktop/ze.app");
            capabilities.setCapability("language", "pt");
            capabilities.setCapability("locale", "BR");

            BaseClass.driver.set(new IOSDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void setCapabilitiesAndroidDF() {
        try {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("app", "");
            caps.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
            caps.setCapability("platform", MobilePlatform.ANDROID);
            caps.setCapability("appActivity", "MainActivity");
            caps.setCapability("device", BaseClass.device_run);
            caps.setCapability("os_version", BaseClass.version_run);
            caps.setCapability("project", "[Android] Automation Testes - Ze Delivery");
            caps.setCapability("build", "Ze Android - " + Utils.getNewDate());
            caps.setCapability("name", "Test Automation Android");
            caps.setCapability("automationName", AutomationName.ANDROID_UIAUTOMATOR2);
            caps.setCapability("real_mobile", true);
            caps.setCapability("browserstack.networkLogs", true);
            caps.setCapability("browserstack.debug", true);
            caps.setCapability("browserstack.acceptInsecureCerts", true);
            caps.setCapability("noReset", false);
            caps.setCapability("language", "pt");
            caps.setCapability("locale", "BR");

            BaseClass.driver.set(new AndroidDriver(new URL("https://user:id@hub-cloud.browserstack.com/wd/hub"), caps));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void setCapabilitiesAndroid() {
        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, BaseClass.device_run);
            capabilities.setCapability("platformVersion", BaseClass.version_run);
            capabilities.setCapability("appActivity", "MainActivity");
            capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
            capabilities.setCapability(MobileCapabilityType.APP, "/Users/eduardofinotti/Desktop/ze.apk");
            capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
            capabilities.setCapability("noReset", false);
            capabilities.setCapability("language", "pt");
            capabilities.setCapability("locale", "BR");

            BaseClass.driver.set(new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
