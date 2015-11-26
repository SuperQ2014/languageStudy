package chapter02.strategy;

public class CashMain {

	public static void main(String[] args) {
		
		double total = 0d;
		CashContext cashContext = new CashContext("打8折");
		total = cashContext.getResult(800);
		System.out.println(total);
	}
}
