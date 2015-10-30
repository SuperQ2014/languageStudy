package primitivevariables;

import java.io.UnsupportedEncodingException;

public class CharByteTest {

	public static void main(String[] args) {
		String str = "我";
		char char1 = '我';
		byte[] byte1 = null;
		byte[] byte2 = null;
		
		try {
			byte1 = str.getBytes("UTF-8");			//默认编码为2，UTF-8的输出为3   使用编码String需要处理UnsupportedEncodingException
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		byte2 = charToByte(char1);
		
		System.out.println(byte1.length);
		System.out.println(byte2.length);
	}
	
	public final static byte[] charToByte(char myChar) {
		byte[] b = new byte[2];
		b[0] = (byte)((myChar & 0xFF00) >> 8);
		b[1] = (byte)(myChar & 0xFF);
		return b;
	}
}
