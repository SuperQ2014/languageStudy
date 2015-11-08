package skyler.tao.infrastructure.memcachedtest;

import com.whalin.MemCached.MemCachedClient;

public class Client {

	public static void main(String[] args) {
		
		Server.init();
		
		MemCachedClient memcachedClient = new MemCachedClient();
		memcachedClient.add("key", 1);
		System.out.println(memcachedClient.get("key"));
		memcachedClient.set("key", 2);
		System.out.println(memcachedClient.get("key"));
		memcachedClient.replace("key", 3);
		System.out.println(memcachedClient.get("key"));
	}
}
