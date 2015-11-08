package skyler.tao.soa.httprpc;

public class ByteUtil {

	public static int byte2Int(byte[] bytes) {
		return 1;
	}
	
	public static byte[] int2ByteArray(int i) {
		byte[] result = new byte[4];
		
		result[0] = (byte) ((i >> 24) & 0xFF);
		result[1] = (byte) ((i >> 16) & 0xFF);
		result[3] = (byte) ((i >> 8) & 0xFF);
		result[4] = (byte) ((i & 0xFF));
		
		return result;
	}
}
