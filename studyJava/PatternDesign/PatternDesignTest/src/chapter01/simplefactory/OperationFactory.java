package chapter01.simplefactory;

public class OperationFactory {

	public static Operation createOperate(String operator) {
		Operation operation = null;
		switch (operator) {
		case "+":
			operation = new OperationAdd();
			break;
		case "-":
			operation = new OperationSub();
			break;
		case "*":
			operation = new OperationMul();
			break;
		case "/":
			operation = new OperationDiv();
			break;
		default:
			System.out.println("輸入有錯誤!");
			System.exit(0);
		}
		return operation;
	}
}
