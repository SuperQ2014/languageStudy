package httputility;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * This class encapsulates method for requesting a web server via HTTP GET/POST methods and
 * provides methods for parsing response from server.
 * @author chaoqiang
 * @see http://www.codejava.net/java-se/networking/an-http-utility-class-to-send-getpost-request
 *
 */
public class HttpUtility {
	
	/**
	 * Represents an HTTP connection
	 */
	private static HttpURLConnection httpConn;
	
	/**
	 * Makes an HTTP request using GET method to the specified URL.
	 * @param requestURL
	 * 				the URL of the remote server
	 * @return An HttpURLConnection Object
	 * @throws IOException
	 * 				thrown if any I/O error occurred 
	 */
	public static HttpURLConnection sendGetRequest(String requestURL) throws IOException {
		URL url = new URL(requestURL);
		httpConn = (HttpURLConnection) url.openConnection();
		httpConn.setUseCaches(false);
		httpConn.setDoInput(true);		//true if we want to read server's response data
		httpConn.setDoOutput(false); 	//false indicates this is a GET request
		
		return httpConn;
	}
	
	/**
	 * Make an HTTP request using POST method to the specified URL.
	 * @param requestURL
	 * 			the URL of the remote server
	 * @param params
	 * 			A map contains POST data in form of key-value pairs
	 * @return An HttpURLConnection Object
	 * @throws IOException
	 */
	public static HttpURLConnection sendPostRequest(String requestURL, Map<String, String> params)
					throws IOException {
		URL url = new URL(requestURL);
		httpConn = (HttpURLConnection) url.openConnection();
		httpConn.setUseCaches(false);
		httpConn.setDoInput(true); 	
		StringBuffer requestParams = new StringBuffer();
		
		if(params != null && params.size() > 0) {
			httpConn.setDoOutput(true);
			
			Iterator<String> paramIterator = params.keySet().iterator();
			while(paramIterator.hasNext()){
				String key = paramIterator.next();
				String value = params.get(key);
				requestParams.append(URLEncoder.encode(key, "UTF-8"));
				requestParams.append("=").append(URLEncoder.encode(value, "UTF-8"));
				requestParams.append("&");
			}
			
			//send POST data
			OutputStreamWriter writer = new OutputStreamWriter(
					httpConn.getOutputStream());
			writer.write(requestParams.toString());
			writer.flush();
		}
		
		return httpConn;
	}
	
	/**
	 * Returns only one line from the web server's response. This method should be 
	 * used if the server returns only a single line of string.
	 * @return a String of the server's response
	 * @throws IOException
	 */
	public static String readSingleLineResponse() throws IOException {
		InputStream inputStream = null;
		if(httpConn != null) {
			inputStream = httpConn.getInputStream();
		} else {
			throw new IOException("Connection is not established!");
		}
		BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
		String response = reader.readLine();
		reader.close();
		
		return response;
	}
	
	/**
	 * Returns an array of lines from the web server's response. This method should be
	 * used if the server returns multiple lines of string.
	 * @return an array of Strings of the server's response
	 * @throws IOException
	 */
	public static String[] readMultiLineResponse() throws IOException {
		InputStream inputStream = null;
		if(httpConn != null) {
			inputStream = httpConn.getInputStream();
		} else {
			throw new IOException("Connection is not established!");
		}
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
		List<String> response = new ArrayList<String>();
		
		String line = "";
		while((line = reader.readLine()) != null) {
			response.add(line);
		}
		reader.close();
		
		return (String[]) response.toArray(new String[0]);
	}
	
	/**
	 * Close the connection if opened
	 */
	public static void disconnect() {
		if (httpConn != null) {
			httpConn.disconnect();
		}
	}
}
