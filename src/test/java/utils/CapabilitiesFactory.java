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
            caps.setCapability("app", "bs://e25b1c72576615910fe7f54db64827eb49554004");
            caps.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.IOS);
            caps.setCapability("platform", MobilePlatform.IOS);
            caps.setCapability("device", "iPhone 11 Pro");
            caps.setCapability("os_version", "13");
            caps.setCapability("project", "[iOS] Automation Testes - Lojong");
            caps.setCapability("build", "Lojong iOS");
            caps.setCapability("name", "Test Automation iOS");
            caps.setCapability("automationName", "XCUITest");
            caps.setCapability("real_mobile", true);
            caps.setCapability("browserstack.networkLogs", true);
            caps.setCapability("browserstack.debug", true);
            caps.setCapability("browserstack.acceptInsecureCerts", true);
            caps.setCapability("noReset", false);

            BaseClass.driver.set(new IOSDriver<>(new URL("https://eduardofinotti1:znLQv8yjGURuwksMJ1hH@hub-cloud.browserstack.com/wd/hub"), caps));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void setCapabilitiesIOS() {
        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 11 Pro Max");
            capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
            capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13.5");
            capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
            capabilities.setCapability(MobileCapabilityType.NO_RESET, false);
            capabilities.setCapability("useNewWDA", true);
            capabilities.setCapability("noReset", false);
            capabilities.setCapability(MobileCapabilityType.APP, "/Users/eduardofinotti/Desktop/Lojong.app");

            // Real device
            // capabilities.setCapability(MobileCapabilityType.APP, "/Users/eduardofinotti/Desktop/Lojong.ipa");
            // capabilities.setCapability(MobileCapabilityType.UDID, "00008030-000D49E42E7B802E");

            BaseClass.driver.set(new IOSDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void setCapabilitiesAndroidDF() {
        try {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("app", "bs://4c0d46e93e858f2cf04c14b199c75ecbbe7fea6c");
            caps.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
            caps.setCapability("platform", MobilePlatform.ANDROID);
            caps.setCapability("appPackage", "br.com.lojong");
            caps.setCapability("appActivity", "br.com.lojong.activity.SplashActivity");
            caps.setCapability("device", "Google Pixel");
            caps.setCapability("os_version", "7.1");
            caps.setCapability("project", "[Android] Automation Testes - Lojong");
            caps.setCapability("build", "Lojong Android");
            caps.setCapability("name", "Test Automation Android");
            caps.setCapability("automationName", AutomationName.ANDROID_UIAUTOMATOR2);
            caps.setCapability("real_mobile", true);
            caps.setCapability("browserstack.networkLogs", true);
            caps.setCapability("browserstack.debug", true);
            caps.setCapability("browserstack.acceptInsecureCerts", true);
            caps.setCapability("noReset", false);
            caps.setCapability("language", "es");
            caps.setCapability("locale", "es_ES");

            BaseClass.driver.set(new AndroidDriver(new URL("https://eduardofinotti1:znLQv8yjGURuwksMJ1hH@hub-cloud.browserstack.com/wd/hub"), caps));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void setCapabilitiesAndroid() {
        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "device 4.7");
            capabilities.setCapability("appPackage", "br.com.lojong");
            capabilities.setCapability("appActivity", "br.com.lojong.activity.SplashActivity");
            capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
            capabilities.setCapability(MobileCapabilityType.APP, "/Users/eduardofinotti/Desktop/app-lojongTest.apk");
            capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
            capabilities.setCapability("platformVersion", "11.0");
            capabilities.setCapability("noReset", false);
            capabilities.setCapability("language", "es");
            capabilities.setCapability("locale", "ES");

            BaseClass.driver.set(new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
