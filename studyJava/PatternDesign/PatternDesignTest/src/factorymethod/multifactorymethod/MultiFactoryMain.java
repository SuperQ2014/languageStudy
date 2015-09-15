package factorymethod.multifactorymethod;

public class MultiFactoryMain {

	public static void main(String[] args) {
		
		SendFactory factory = new SendFactory();
		Sender sender = factory.produceMail();
		sender.send();
	}
}
