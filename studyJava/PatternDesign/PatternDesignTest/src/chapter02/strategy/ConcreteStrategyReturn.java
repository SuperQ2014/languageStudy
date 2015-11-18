package chapter02.strategy;

public class ConcreteStrategyReturn extends Strategy {

	private double moneyCondition = 0d;
	private double moneyReturn = 0d;
	
	public double getMoneyCondition() {
		return moneyCondition;
	}
	public double getMoneyReturn() {
		return moneyReturn;
	}
	
	public ConcreteStrategyReturn(double moneyCondition, double moneyReturn) {
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
