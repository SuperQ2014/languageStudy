package chapter02.strategy;

public class ConcreteStrategyNormal extends Strategy {

	@Override
	public double acceptCash(double money) {
		return money;
	}
}
