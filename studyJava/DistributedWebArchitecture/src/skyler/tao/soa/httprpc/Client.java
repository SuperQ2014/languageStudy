package skyler.tao.soa.httprpc;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) throws UnknownHostException, IOException {
		Request request = new Request();
		request.setCommand("HELLO");
		request.setCommandLength(request.getCommand().length());
		request.setEncode((byte) 1);
		
		Socket client = new Socket("127.0.0.1", 8832);
		OutputStream output = client.getOutputStream();
		
		//send request
		ProtocolUtil.writeRequest(output, request);
		
		//read response
		InputStream input = client.getInputStream();
		Response response = ProtocolUtil.readResponse(input);
	}
}
