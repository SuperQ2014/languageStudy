package inetdddress;

//import java.net.InetAddress;
//import java.net.*;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTestMain {
	public static void main(String args[]) throws UnknownHostException {	
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
