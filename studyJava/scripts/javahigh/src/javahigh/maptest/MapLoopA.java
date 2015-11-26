package javahigh.maptest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.junit.BeforeClass;
import org.junit.Test;

public class MapLoopA {

	private static Map<Integer, String> info = new HashMap<Integer, String>();
	
	@BeforeClass
	public static void setUp() {
		for (int i = 0; i < 10000000; i++) {
			info.put(i, "some information about" + i);
		}
		System.out.println("Map setup is done!");
	}
	
	@Test
	public void testMapLoopA() {
		Iterator<Map.Entry<Integer, String>> iter = info.entrySet().iterator();
		long startTime = System.currentTimeMillis();
		
		while(iter.hasNext()) {
			Map.Entry<Integer, String> entry = iter.next();
			Integer key = entry.getKey();
			String value = entry.getValue();
		}
		
		long endTime = System.currentTimeMillis();
		long resultTime = endTime - startTime;
		System.out.println("The Map Loop A methods takes " + resultTime + " ms");
	}
	
	@Test
	public void testMapLoopB() {
		Iterator<Integer> iter = info.keySet().iterator();
		long startTime = System.currentTimeMillis();
		
		while(iter.hasNext()) {
			Integer key = iter.next();
			String value = info.get(key);
		}
		
		long endTime = System.currentTimeMillis();
		long resultTime = endTime - startTime;
		System.out.println("The map loop B methods takes " + resultTime + " ms");
	}
}
