package lambdaexpresion;

public class CommandTest {

	public static void main(String[] args) {
		
		ProcessArray processArr = new ProcessArray();
		int[] array = {2,3,5,6,7,-1};
		
		processArr.processTheArray(array, ((int[] target) -> {
					int sum = 0;
					for (int tmp : target) {
						sum += tmp;
					}
					System.out.println("The sum is: " + sum);
				}
				));
	}
}
