package tcpip;

import java.net.*;
import java.io.*;

public class WhoisMain {
	public static void main(String[] args) {
		int c;
		try {
			Socket s = new Socket("www.baidu.com",80);
			InputStream in = s.getInputStream();
			OutputStream out = s.getOutputStream();
			String str = (args.length == 0 ? "api.mobile.sina.com" : args[0]) + "\n";
			byte buf[] = str.getBytes();
			out.write(buf);
			System.out.println("===========");
			while ((c = in.read()) != -1) {
				System.out.print( (char)c );
			}
			System.out.println("===========");
			System.out.println(buf);
			s.close();
		} catch (Exception e) {
			System.out.println("occurs some exception!");
			e.printStackTrace();
		}
	}
}
