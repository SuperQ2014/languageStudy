package collectionsbasic;

import java.util.HashMap;

public class testMap {
	
	public static void main(String[] args) {
		
		HashMap<String, String> myMap = new HashMap<String, String>();
		myMap.put("hello", "world");
		System.out.println(myMap.size());
	}
}
