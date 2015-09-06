package exceptionBasic;

import java.util.Random;

public class HandlerError {
	public static void main(String[] args) {
		int a = 0, b = 0, c = 0;
		Random r = new Random();
		
		System.out.println(r);
		a = r.nextInt(20);
		System.out.println(a);
		a = r.nextInt(100);
		System.out.println(a);
		a = r.nextInt(2);
		System.out.println(a);
		
		/*for (int i = 0; i < 32000; i++) {
			try {
				b = r.nextInt();
				c = r.nextInt();
				a = 12345/ (b/c);
			} catch (ArithmeticException e) {
				a = 0;
				System.out.println("Division by zero!");
			}
			System.out.println("a: " + a);
		}*/
	}
}
