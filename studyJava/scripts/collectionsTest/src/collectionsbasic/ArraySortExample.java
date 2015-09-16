package collectionsbasic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Comparator;

/**
 * In this example, I will show how to use the java.util.Collections class in order to perform sorting.
 * The Collections class consists of static methods that return or operate on collections, 
 * such as Lists, Maps, Sets, etc.
 * All the methods throw a NullPointerException if the collection(s) passed as a parameter is/are null.
 * @author chaoqiang
 *
 */
public class ArraySortExample {
	
	public static void main(String[] args) {
		ArrayList<Integer> randInts = new ArrayList<>();
		Random rand = new Random();
		
		//Generate 5 random ints for randInts
		for (int i = 0; i < 5; i++) {
			randInts.add(rand.nextInt(100));
		}
		
		//show the unordered randInts
		printList(randInts);
		ArrayList<Integer> randInts_back = new ArrayList<>(randInts);
		//sort the randInts ArrayList
		Collections.sort(randInts_back);
		
		//show the ordered randInts
		printList(randInts_back);
		
		//sort the randInts ArrayList in the other direction
		Collections.sort(randInts, new Comparator<Integer>() {
			@Override
			public int compare(Integer int1, Integer int2) {
				return (int2.intValue() > int1.intValue()) ? 1 : -1;
			}
		});
		
		//show the ordered randInts
		printList(randInts);
	}
	
	private static void printList(List<Integer> list) {
		System.out.print("[ ");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println(" ]");
	}
}
