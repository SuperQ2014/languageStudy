package abstractfactory;

public class SendSmsFactory implements Producer {
	
	@Override
	public Sender produce() {
		return new SmsSender();
	}
}
