package chapter02.strategy;

public class ConcreteStrategyRebate extends Strategy {

private double moneyRebate = 1d;
	
	public ConcreteStrategyRebate(double moneyRebate) {
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
