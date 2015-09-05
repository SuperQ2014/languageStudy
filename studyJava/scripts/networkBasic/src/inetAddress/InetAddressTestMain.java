package inetAddress;

//import java.net.InetAddress;
import java.net.*;

public class InetAddressTestMain {
	public static void main(String args[]) throws UnknownHostException {	//如果import的不是net.*,而是net.InetAddress，则UnknownHostException无法resolved
		InetAddress Address = InetAddress.getLocalHost();
		System.out.println(Address);
		
		Address = InetAddress.getByName("www.baidu.com");
		System.out.println(Address);
		
		InetAddress addresses[] = InetAddress.getAllByName("www.nba.com");
		for(int i = 0; i < addresses.length; i++) {
			System.out.println(addresses[i]);
		}
	}
}
