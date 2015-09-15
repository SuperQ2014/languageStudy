package urlbasic;

import java.net.*;

public class URLTestMain {
	public static void main(String[] args) {
		try {
			URL hp = new URL("https://www.osborne.com:8080/download");
			System.out.println("Protocol: " + hp.getProtocol());
			System.out.println("Port: "     + hp.getPort());
			System.out.println("Host: "     + hp.getHost());
			System.out.println("File: "     + hp.getFile());
			System.out.println("Ext:  "     + hp.toExternalForm());
		} catch (MalformedURLException e) {
			System.out.println("Occurs some Exception! As follow: ");
			e.getStackTrace();
		}
	}
}
