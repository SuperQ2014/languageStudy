package chapter02.simplefactory;

public class CashMain {

	public static void main(String[] args) {
		
		double total = 0d;
		CashSuper cashSuper = CashFactory.createCashAccept("打8折");
		total = cashSuper.acceptCash(5823);
		System.out.printf("最終的金額為：%.2f", total);
	}
}
