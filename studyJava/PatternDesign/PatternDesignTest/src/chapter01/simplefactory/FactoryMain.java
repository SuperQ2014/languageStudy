package chapter01.simplefactory;

public class FactoryMain {

	public static void main(String[] args) {
		Operation operation;
		operation = OperationFactory.createOperate("/");
		operation.set_numberA(32);
		operation.set_numberB(22.1);
		double result = operation.getResult();
		System.out.println("結果是：" + result);
	}
}
