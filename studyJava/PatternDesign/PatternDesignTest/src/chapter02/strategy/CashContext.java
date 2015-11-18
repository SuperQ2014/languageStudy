package chapter02.strategy;

public class CashContext {

	Strategy cashStrategy = null;
	
	public CashContext(String type) {
		switch (type) {
		case "正常收费":
			ConcreteStrategyNormal cashNormal = new ConcreteStrategyNormal();
			cashStrategy = cashNormal;
			break;
		case "满300返100":
			ConcreteStrategyReturn cashReturn = new ConcreteStrategyReturn(300, 100);
			cashStrategy = cashReturn;
			break;
		case "打8折":
			ConcreteStrategyRebate cashRebate = new ConcreteStrategyRebate(0.8);
			cashStrategy = cashRebate;
			break;
		default:
			System.out.println("輸入不正確！");
			System.exit(0);
		}
	}

	
	public double getResult(double money) {
		return cashStrategy.acceptCash(money);
	}
}
