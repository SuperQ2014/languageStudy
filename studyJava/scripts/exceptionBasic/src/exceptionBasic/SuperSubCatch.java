package exceptionBasic;

public class SuperSubCatch {
	public static void main(String[] args) {
		try {
			int a = 0;
			int b = 22/a;
		} catch (Exception e) {
			System.out.println("Super exception");
		} catch (ArithmeticException e) {
			System.out.println("Sub exception ArithmeticException");
		}
	}
}
