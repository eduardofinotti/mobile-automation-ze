package utils;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;

public class AppiumController {

    private static Logger log = LoggerFactory.getLogger(AppiumController.class);
    AppiumDriverLocalService appiumDriverLocalService;

    public AppiumController() {
    }

    private AppiumDriverLocalService startAppiumService(String path, String runIp) {
        AppiumServiceBuilder builder = getAppiumBuildService(path, runIp);
        appiumDriverLocalService = AppiumDriverLocalService.buildService(builder);
        appiumDriverLocalService.start();
        log.info("**************************************************************************\n");
        log.info("Appium Server Started at......" + appiumDriverLocalService.getUrl().getPort());
        log.info("**************************************************************************\n");
        return appiumDriverLocalService;
    }

    public AppiumServiceBuilder getAppiumBuildService(String path, String runIp) {
        return new AppiumServiceBuilder()
                .withAppiumJS(new File(path))
                .withArgument(GeneralServerFlag.LOG_LEVEL, "info")
                .usingAnyFreePort()
                .withIPAddress(runIp);
    }
}
