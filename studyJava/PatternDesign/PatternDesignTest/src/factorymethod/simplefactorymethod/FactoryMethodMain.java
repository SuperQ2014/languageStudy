package factorymethod.simplefactorymethod;

public class FactoryMethodMain {
	public static void main(String[] args) {
		SendFactory factory = new SendFactory();
		Sender sender = factory.produce("Sms");
		sender.send();
	}
}
