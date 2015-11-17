package chapter01;

public class Operation {

	public static double getResult(double numberA, double numberB, String operate) {
		double result = 0d;
		switch (operate) {
		case "+":
			result = numberA + numberB;
			break;
		case "-":
			result = numberA - numberB;
			break;
		case "*":
			result = numberA * numberB;
			break;
		case "/":
			result = numberA / numberB;
			break;
		default:
			System.out.println("The input is error!");
			System.exit(0);
		}
		return result;
	}
}
