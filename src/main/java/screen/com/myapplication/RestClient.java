package screen.com.myapplication;


import com.loopj.android.http.*;
public class RestClient {


    // 局域网
   //private static final String BASE_URL = "http://192.167.30.202/index.php/home/api/";

    // 模拟器
    //private static final String BASE_URL = "http://10.0.2.2/index.php/home/api/";

    // 郭-测试web服务器
    private static final String BASE_URL = "http://192.168.3.40/index.php/home/api/";

    private static AsyncHttpClient client = new AsyncHttpClient();

    public static void get(String url, RequestParams params, AsyncHttpResponseHandler responseHandler) {
        client.get(getAbsoluteUrl(url), params, responseHandler);
    }

    public static void post(String url, RequestParams params, AsyncHttpResponseHandler responseHandler) {
        client.post(getAbsoluteUrl(url), params, responseHandler);
    }

    private static String getAbsoluteUrl(String relativeUrl) {
        return BASE_URL + relativeUrl;
    }
}
