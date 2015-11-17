package chapter02.simplefactory;

public class CashRebate implements CashSuper {

	private double moneyRebate = 1d;
	
	public CashRebate(double moneyRebate) {
		this.moneyRebate = moneyRebate;
	}
	
	public double getMoneyRebate() {
		return moneyRebate;
	}
	
	@Override
	public double acceptCash(double money) {
		return money * moneyRebate;
	}
}
