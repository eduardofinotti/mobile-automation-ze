package hooks;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppiumFactory {

    private static Logger log = LoggerFactory.getLogger(AppiumFactory.class);

    public static void startAppium() {
        AppiumServiceBuilder builder = new AppiumServiceBuilder();
        builder.usingPort(4723);
        builder.withIPAddress("127.0.0.1");
        builder.withArgument(GeneralServerFlag.SESSION_OVERRIDE);
        builder.withArgument(GeneralServerFlag.LOG_LEVEL, "error");

        try {
            BaseClass.service = AppiumDriverLocalService.buildService(builder);
            BaseClass.service.start();
            log.info("Appium running...");
        } catch (Exception error) {
            log.error("Erro ao iniciar o Appium!");
        }
    }
}
