package collectionsbasic;

import java.util.Arrays;
//import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * An ArrayList is a dynamic data structure so it can be used when there is 
 * no upper bound on the number of elements. From the other side, a simple Array 
 * in java is a static data structure, because the initial size of array cannot be changed, 
 * so it can be used only when the data has a known number of elements.
 * @author chaoqiang
 *
 */
public class ArrayListExamples {
	
	public static void main(String[] args) {
		//Creating an empty array list
		ArrayList<String> arrayList = new ArrayList<String>();
		//Adding items to arrayList
		arrayList.add("Item1");
		arrayList.add("Item2");
		arrayList.add(2, "Item3");	//it will add Item3 to the third position of arrayList
		arrayList.add("Item4");
		
		//display the contents of the arrayList
		System.out.println("The arrayList contains the following elements: " + arrayList);
		
		//Checking index of an item
		int pos = arrayList.indexOf("Item3");	//2
		System.out.println("The index of Item3 is : " + pos);		
		
		//checking if arrayList is empty
		boolean isEmpty = arrayList.isEmpty();	//false
		System.out.println("Checking the arrayList is empty: " + isEmpty);
		
		//Getting the size of the list
		int size = arrayList.size();	//4
		System.out.println("The size of the arrayList is : " + size);
		
		//Checking if an element is included to the arrayList
		boolean elementInclude = arrayList.contains("Item5");	//false
		System.out.println("the element Item5 is included in the arrayList: " + elementInclude);
		
		//Getting the element in a specific position
		String item = arrayList.get(0);		//Item1
		System.out.println("The element in pos 0 is: " + item);
		
		//Retrieve all elements from the arrayList
		
		System.out.println("Retrieve all elements using loop with index and size");
		//method 1: loop using index and size of arrayList
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println("Index: " + i + " is " + arrayList.get(i));
		}
		
		System.out.println("Retrieve all elements using foreach loop");
		//method 2: using foreach loop
		for(String str : arrayList) {
			System.out.println("Item is : " + str);
		}
		
		System.out.println("Retrieve all elements using iterator");
		//method 3: using iterator
		Iterator<String> it = arrayList.iterator();
		while(it.hasNext()) {
			System.out.println("Item is : " + it.next());
		}
		
		//Replacing an element
		arrayList.set(1, "NewItem");
		System.out.println("The new arrayList after replacing an element: " + arrayList);
		
		//Removing items
		arrayList.remove(2);
		arrayList.remove("Item1");
		System.out.println("The new arrayList after removing two elements: " + arrayList);
		
		//Converting arrayList to Array
		String[] simpleArray = arrayList.toArray(new String[arrayList.size()]);
		System.out.println("The array created after the convertion of our arrayList is : " + Arrays.toString(simpleArray));
		System.out.println("The array created after the convertion of our arrayList is : " + simpleArray);	//output is pointer address
	}
}
