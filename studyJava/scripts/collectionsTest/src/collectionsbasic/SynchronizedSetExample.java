package collectionsbasic;

import java.util.Set;
import java.util.HashSet;
import java.util.Collections;

public class SynchronizedSetExample {

	public static void main(String[] args) {
		
		HashSet hashSet = new HashSet();
		hashSet.add("element_1");
		hashSet.add("element_2");
		hashSet.add("element_3");
		hashSet.add("element_4");
		hashSet.add("element_5");
		
		System.out.println("The hashSet: " + hashSet);
		System.out.println("The hashSet: " + hashSet);
		System.out.println("The hashSet: " + hashSet);
		
		Set syncSet = Collections.synchronizedSet(hashSet);
		System.out.println("The synchronized Set contains: " + syncSet);
	}
}
