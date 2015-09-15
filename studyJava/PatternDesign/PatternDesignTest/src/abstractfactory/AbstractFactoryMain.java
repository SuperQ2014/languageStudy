package abstractfactory;

public class AbstractFactoryMain {
	public static void main(String[] args) {
//		Producer provider = new SendMailFactory();
		Producer provider = new SendSmsFactory();
		Sender sender = provider.produce();
		sender.send();
	}
}
