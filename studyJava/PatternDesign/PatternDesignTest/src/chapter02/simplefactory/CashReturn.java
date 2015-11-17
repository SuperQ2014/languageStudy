package chapter02.simplefactory;

public class CashReturn implements CashSuper {

	private double moneyCondition = 0d;
	private double moneyReturn = 0d;
	
	public double getMoneyCondition() {
		return moneyCondition;
	}
	public double getMoneyReturn() {
		return moneyReturn;
	}
	
	public CashReturn(double moneyCondition, double moneyReturn) {
		this.moneyCondition = moneyCondition;
		this.moneyReturn = moneyReturn;
	}
	
	@Override
	public double acceptCash(double money) {

		if (money >= moneyCondition) {
			return money - (int)(money/moneyCondition) * moneyReturn;
		} else {
			return money;
		}
	}

}
