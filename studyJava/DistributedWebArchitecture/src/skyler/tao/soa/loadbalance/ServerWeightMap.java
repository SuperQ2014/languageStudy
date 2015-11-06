package skyler.tao.soa.loadbalance;

import java.util.HashMap;
import java.util.Map;

public class ServerWeightMap {

	private Map<String, Integer> serverWeightMap;
	public Integer num;
	
	public ServerWeightMap() {
		serverWeightMap = new HashMap<String, Integer>();
		serverWeightMap.put("localhost:8831", 1);
		serverWeightMap.put("localhost:8832", 2);
		serverWeightMap.put("localhost:8833", 3);
		serverWeightMap.put("localhost:8834", 1);
		num = 3;
	}

	public Map<String, Integer> getServerWeightMap() {
		return serverWeightMap;
	}
	
	public static void main(String[] args) {
		ServerWeightMap serverWeightMap = new ServerWeightMap();
		System.out.println(serverWeightMap.getServerWeightMap());
		System.out.println(serverWeightMap.num);
	}
}
