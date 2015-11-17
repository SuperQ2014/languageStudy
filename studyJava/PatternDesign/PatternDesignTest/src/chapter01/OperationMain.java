package chapter01;

import java.util.Scanner;

public class OperationMain {

	public static void main(String[] args) {
		try {
			Scanner scannerInput = new Scanner(System.in);
			System.out.println("请输入数字A：");
			double numberA = scannerInput.nextDouble();
			System.out.println("请输入数字B：");
			double numberB = scannerInput.nextDouble();
			System.out.println("请输入运算符（+、-、*、/）：");
			String operator = scannerInput.next();
			String result = "";
			result = String.valueOf(Operation.getResult(numberA, numberB, operator));
			System.out.println("计算结果是：" + result);
			scannerInput.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
