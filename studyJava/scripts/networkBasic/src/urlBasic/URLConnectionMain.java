package urlBasic;

import java.net.*;
import java.io.*;
import java.util.Date;

public class URLConnectionMain {
	public static void main(String[] args) throws Exception {
		int c;
		URL hp = new URL("http://221.179.193.178:8831");
		URLConnection hpCon = hp.openConnection();
		
		System.out.println("Date: "          + new Date(hpCon.getDate()));
		System.out.println("Content-Type: "  + hpCon.getContentType());
		System.out.println("Expires: "       + hpCon.getExpiration());
		System.out.println("Last-Modified: " + new Date(hpCon.getLastModified()));
		
		int len = hpCon.getContentLength();
		System.out.println("Content-Length: "+ len);
		
		if(len  > 0) {
			System.out.println("=======Content=======");
			InputStream in = hpCon.getInputStream();
			int i = len;
			while (((c = in.read()) != -1) && (--i > 0)){
				System.out.print( (char)c );
			}
			in.close();
		}
		else {
			System.out.println("No Content Available!");
		}
	}
}
