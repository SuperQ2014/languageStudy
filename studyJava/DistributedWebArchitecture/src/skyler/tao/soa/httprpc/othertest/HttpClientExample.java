package skyler.tao.soa.httprpc.othertest;

import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

public class HttpClientExample {

	public static void main(String[] args) {
		String url = "http://www.baidu.com";
		
		HttpClient httpClient = new DefaultHttpClient();
		HttpGet httpGet = new HttpGet(url);
		
		HttpResponse response = httpClient.execute(httpGet);
		
		HttpEntity entity = response.getEntity();
		
		byte[] bytes = EntityUtils.toByteArray(entity);
		String result = new String(bytes, "utf8");
		System.out.println(result);
	}
}
