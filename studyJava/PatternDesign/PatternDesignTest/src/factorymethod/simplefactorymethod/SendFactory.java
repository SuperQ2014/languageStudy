package factorymethod.simplefactorymethod;

public class SendFactory {
	
	public Sender produce(String type) {
		if ("Mail".equals(type)) {
			return new MailSender();
		}
		else if ("Sms".equals(type)) {
			return new SmsSender();
		}
		else {
			System.out.println("Please input a valid Sender name!");
			return null;
		}
	}
}
