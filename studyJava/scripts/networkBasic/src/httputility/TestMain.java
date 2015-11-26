package httputility;

import java.io.IOException;
import java.net.HttpURLConnection;
//import HttpUtility;
public class TestMain {
	public static void main(String[] args) throws IOException {
		
		String request = "http://www.baidu.com";
		HttpURLConnection httpConn = HttpUtility.sendGetRequest(request);
//		System.out.println(httpConn.getResponseCode());
		System.out.println(httpConn.getRequestMethod());
//		System.out.println(httpConn.getResponseMessage());
		System.out.println(httpConn.getPermission());
		
		HttpUtility.disconnect();
	}
}
