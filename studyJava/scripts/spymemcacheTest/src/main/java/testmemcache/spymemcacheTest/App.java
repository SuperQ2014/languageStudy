package testmemcache.spymemcacheTest;

import java.net.InetSocketAddress;

import net.spy.memcached.MemcachedClient;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        int portNum = 11611;
        String hostName = "localhost";
        InetSocketAddress socketAdd;
        try {
        	socketAdd = new InetSocketAddress(hostName, portNum);
        } catch (Exception e1) {
        	e1.printStackTrace();
        	return;
        }
        MemcachedClient client;
        try {
        	client = new MemcachedClient(socketAdd);
        } catch (Exception e2) {
        	e2.printStackTrace();
        	return;
        }
        
        client.set("name", 3600, "chaoqiang");
        Object myObject = client.get("name");
        System.out.println(myObject);
    }
}
