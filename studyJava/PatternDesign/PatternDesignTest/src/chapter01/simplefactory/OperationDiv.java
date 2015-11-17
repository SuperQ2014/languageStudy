package chapter01.simplefactory;

public class OperationDiv extends Operation {

	@Override
	public double getResult() {

		double numberA = super.get_numberA();
		double numberB = super.get_numberB();
		double result = 0;
		try {
			result = numberA / numberB;
		} catch (Exception e) {
			System.out.println("除數不能為零。");
			e.printStackTrace();
		}
		return result;
	}

}
