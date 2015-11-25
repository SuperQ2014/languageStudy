package lambdaexpresion;

import java.util.Arrays;
import java.util.List;

public class ForeachLooper {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 4, 5, 6, 91);
		
		System.out.println("method one:");
		for (int number : numbers) {
			System.out.println(number);
		}
		
		System.out.printf("\nmethod two:\n");
		numbers.forEach((Integer value) -> System.out.println(value));
	}
}
