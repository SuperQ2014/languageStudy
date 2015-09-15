package factorymethod.multistaticfactory;

public class MultiStaticFactoryMain {
	public static void main(String[] args) {
		
//		SendFactory factory = new SendFactory();
		Sender sender = SendFactory.produceMail();
		sender.send();
	}
}
