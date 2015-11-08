package skyler.tao.soa.httprpc;

import java.io.IOException;
import java.io.InputStream;

import org.omg.CORBA.portable.OutputStream;

public class ProtocolUtil {
	
	private static final int GBK = 0;
	private static final int UTF = 1;

	public static Request readRequest(InputStream input) throws IOException {
		
		//read encode
		byte[] encodeByte = new byte[1];
		input.read(encodeByte);
		byte encode = encodeByte[0];
		
		//read command length
		byte[] commandLengthBytes = new byte[4];
		input.read(commandLengthBytes);
		int commandLength = ByteUtil.byte2Int(commandLengthBytes);
		
		//read command
		byte[] commandBytes = new byte[commandLength];
		input.read(commandBytes);
		String command = "";
		
		if(GBK == encode) {
			command = new String(commandBytes, "GBK");
		} else {
			command = new String(commandBytes, "UTF8");
		}
		
		//assemble request return
		Request request = new Request();
		request.setCommand(command);
		request.setEncode(encode);
		request.setCommandLength(commandLength);
		
		return request;
	}
	
	public static void writeResponse(OutputStream output, Response response) throws IOException {
		//return response to client
		output.write(response.getEncode());
		output.write(ByteUtil.int2ByteArray(response.getResponseLength()));
		
		if (GBK == response.getEncode()) {
			output.write(response.getResponse().getBytes());
		} else {
			output.write(response.getResponse().getBytes("UTF8"));
		}
	}
}
