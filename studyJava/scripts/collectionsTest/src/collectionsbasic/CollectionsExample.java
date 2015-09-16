package collectionsbasic;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

/**
 * In this article we will discuss about the Collections class and some of its important methods. 
 * The class java.util.Collections is a utility class that resides in java.util package, 
 * it consists entirely of static methods which are used to operate on collections like List, Set. 
 * Common operations like sorting a List or finding an element from a List can easily be done using the Collections class.
 * We will use an ArrayList in the following examples to illustrate the use of Collections class. 
 * The list in the examples stores elements of type Double. 
 * Let us assume this list contains temperature of a place.
 * @author chaoqiang
 * @see http://examples.javacodegeeks.com/core-java/util/collections/java-util-collections-example/
 *
 */
public class CollectionsExample {

	public static void main(String[] args) {
		List<Double> temperatureList = new ArrayList<Double>();
		
		temperatureList.add(40.3);
		temperatureList.add(50.4);
		temperatureList.add(20.9);
		temperatureList.add(90.3);
		temperatureList.add(10.3);
		temperatureList.add(30.1);
		
		//Print elements of temperatureList
		System.out.println(temperatureList);
		
		//Sorting List in ascending order according to the natural ordering
		Collections.sort(temperatureList);
		System.out.println("Sorted List: " + temperatureList);
		
		//Searching a temperature from List
		//This method is used to search the element T in the given list. 
		//It returns an index of the searched element if found; 
		//otherwise (-) insertion point. 
		//Please note that the list must be in sorted into ascending order 
		//before calling this method otherwise result would not be as expected.  ???
		int searchIndex = Collections.binarySearch(temperatureList, 30.12);
		if(searchIndex >= 0) {
			System.out.println("Temperature found!");
			System.out.println("The searchIndex is: " + searchIndex);
		} else {
			System.out.println("The searchIndex is: " + searchIndex);
			System.out.println("Temperature not found!");
		}
		
		//Shuffles the List
		Collections.shuffle(temperatureList);
		System.out.println("Shuffled List: " + temperatureList);
		
		//Fill temperatureList
		Collections.fill(temperatureList, 0.0);
		System.out.println("Filled List: " + temperatureList);
	}
}
