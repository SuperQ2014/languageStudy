package skyler.tao.soa.loadbalance;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class RoundRobin {
	
	private static Integer pos = 1;

	public static String testRoundRobin() {
			
		ServerWeightMap serverWeightMapClass = new ServerWeightMap();
		Map<String, Integer> serverWeightMap = serverWeightMapClass.getServerWeightMap();
		
		Map<String, Integer> serverMap = new HashMap<String, Integer>();
		serverMap.putAll(serverWeightMap);
			
		Set<String> keySet = serverMap.keySet();
		ArrayList<String> keyList = new ArrayList<String>();
		keyList.addAll(keySet);
			
		String server = null;
			
		synchronized (pos) {
			
			if (pos >= keySet.size()) {
				pos = 0;
			}
				
			server = keyList.get(pos);
			pos ++;
		}
		return server;
	}
	
	public static void main(String[] args) {
		
		System.out.println(RoundRobin.testRoundRobin());
	}
}
