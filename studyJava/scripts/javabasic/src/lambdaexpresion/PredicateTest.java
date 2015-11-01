package lambdaexpresion;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest {

	private static List<Integer> numbers;

	public static void main(String[] args) throws NullPointerException {
		numbers = new ArrayList<Integer>();
		for (int i = 1; i < 1000; i++) {
			int number = i;
			numbers.add(number);
		}
		
		sumAll(numbers, (n -> true));
		sumAll(numbers, n -> n % 2 == 0);
		sumAll(numbers, n -> n > 3);
	}
	
	public static int sumAll(List<Integer> numbers, Predicate<Integer> p) {
		int total = 0;
		for (int number : numbers) {
			if (p.test(number)) {
				total += number;
			}
		}
		System.out.println("The total count is: " + total);
		return total;
	}
}
