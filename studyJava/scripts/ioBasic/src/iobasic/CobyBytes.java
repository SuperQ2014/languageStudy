package iobasic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CobyBytes {
	public static void main(String[] args) throws IOException {
		
		FileInputStream in   = null;
		FileOutputStream out = null;
		
		try {
			in  = new FileInputStream("FixHand.stl");		//字节流，可以包含中文
			out = new FileOutputStream("output_byte.stl");
			int c;
			
			while( (c = in.read()) != -1 ) {
				out.write(c);
			}
		} finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
		}
	}
}
