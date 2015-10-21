package leetcode;

public class TwoSum {

	public static void main(String[] args) {
		int[] numbers = {2, 7, 11, 15};
		int target = 9;
		int[] results = twoSum(numbers, target);
		System.out.println(results);
	}
	
	public static int[] twoSum(int[] numbers, int target) {
		int[] results = numbers;
		for (int i = 0; i < numbers.length; i++) {
			int index2 = target - i;
		}
		return results;
	}
}
