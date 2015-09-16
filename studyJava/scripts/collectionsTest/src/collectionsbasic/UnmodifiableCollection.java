package collectionsbasic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class UnmodifiableCollection {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("element_1");
		list.add("element_2");
		list.add("element_3");
		list.add("element_4");
		
		Collection unmodifiableCollection = Collections.unmodifiableCollection(list);
		System.out.println("UnmodifiableCollection contains: " + unmodifiableCollection);	
	}
}
