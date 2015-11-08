package skyler.tao.infrastructure.memcachedtest;

import com.whalin.MemCached.SockIOPool;

public class Server {
	
	public static void init() {
		String[] servers = {
				"10.77.96.56:8831"
		};
		
		SockIOPool pool = SockIOPool.getInstance();
		pool.setServers(servers);
		pool.setFailover(true);
		pool.setInitConn(10);
		pool.setMinConn(25);
		pool.setMaxConn(30);
		pool.setMaintSleep(30);
		pool.setNagle(false);
		pool.setSocketTO(3000);
		pool.setAliveCheck(true);
		pool.setHashingAlg(SockIOPool.CONSISTENT_HASH);
		pool.initialize();
	}
}
