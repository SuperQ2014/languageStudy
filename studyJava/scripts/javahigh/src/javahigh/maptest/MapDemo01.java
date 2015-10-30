package javahigh.maptest;

import java.util.Map;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.Iterator;

public class MapDemo01 {

	public static void main(String[] args) {
		Map<String, String> hashMap = new HashMap<String, String>();
		Map<String, String> treeMap = new TreeMap<String, String>();
		
		hashMap.put("city", "beijing");
		treeMap.put("name", "Skyler");
		
		System.out.println(hashMap.size());
		System.out.println(treeMap.size());
		
		hashMap.put("key1", "value1");
		hashMap.put("key2", "value2");
		hashMap.put("key3", "value3");
		
		for(Map.Entry<String, String> m : hashMap.entrySet()) {
			System.out.println(m.getKey() + " : " + m.getValue());
		}
		System.out.println("===========");

		
		Iterator<Entry<String, String>> iterator = hashMap.entrySet().iterator();
		while(iterator.hasNext()) {
			Map.Entry<String, String> entry = (Entry<String, String>) iterator.next();
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		System.out.println("===========");
		
		treeMap.put("key1", "value1");
		treeMap.put("key2", "value2");
		treeMap.put("key3", "value3");
		
		for(Map.Entry<String, String> m : treeMap.entrySet()) {
			System.out.println(m.getKey() + " : " + m.getValue());
		}
	}
}
