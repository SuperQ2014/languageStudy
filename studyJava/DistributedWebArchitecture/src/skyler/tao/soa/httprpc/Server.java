package skyler.tao.soa.httprpc;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	ServerSocket server = new ServerSocket(8832);
	
	while(true) {
		
		Socket client = server.accept();
		
		//read response
		InputStream input = client.getInputStream();
		Request request = ProtocolUtil.readRequest(input);
		
		OutputStream output = client.getOutputStream();
		
		//assemble response data
		Response response = new Response();
		response.setEncode((byte) 1);
		
		if (request.getCommand().equals("HELLO")) {
			response.setResponse("hello!");
		} else {
			response.setResponse("bye bye!");
		}
		
		response.setResponseLength(response.getResponse().length());
		ProtocolUtil.writeResponse(output, response);
	}
}