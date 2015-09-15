package factorymethod.multistaticfactory;

public class SmsSender implements Sender{

	@Override
	public void send() {
		System.out.println("This is a Sms sender!");
	}
}
