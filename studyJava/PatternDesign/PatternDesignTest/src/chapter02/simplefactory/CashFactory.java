package chapter02.simplefactory;

public class CashFactory {

	public static CashSuper createCashAccept(String type) {
		
		CashSuper cashType = null;
		switch (type) {
		case "正常收費":
			cashType = new CashNormal();
			break;
		case "滿300返100":
			cashType = new CashReturn(300, 100);
			break;
		case "打8折":
			cashType = new CashRebate(0.8);
			break;
		default:
			System.out.println("輸入不正確！");
			System.exit(0);
		}
		return cashType;
	}
}
