package utils;

import okhttp3.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class ResultsAPIRequests {

    private static String APPJSON = "application/json";
    private static Logger log = LoggerFactory.getLogger(ResultsAPIRequests.class);

    public static void sendTestStatusToBrowserStack(String error, String status, String sessionId) {
        String url = "https://api.browserstack.com/app-automate/sessions/" + sessionId + ".json";
        OkHttpClient client = new OkHttpClient();

        String json = "{\"status\": \"" + status + "\", \"reason\": \"" + error + "\"}";

        MediaType mediaType = MediaType.parse(APPJSON);
        RequestBody body = RequestBody.create(mediaType, json);
        Request request = new Request.Builder()
                .url(url)
                .put(body)
                .addHeader("Content-Type", APPJSON)
                .addHeader("Accept", "*/*")
                .addHeader("Authorization", "Basic ZWR1YXJkb2Zpbm90dGkxOnpuTFF2OHlqR1VSdXdrc01KMWhI")
                .build();

        try {
            Response response = client.newCall(request).execute();
            ResponseBody responseBody = response.body();
            responseBody.close();
        } catch (IOException e) {
            log.error(e.getMessage());
        }
    }
}
