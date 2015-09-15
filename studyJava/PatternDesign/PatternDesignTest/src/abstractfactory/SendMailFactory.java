package abstractfactory;

public class SendMailFactory implements Producer {
	
	@Override
	public Sender produce() {
		return new MailSender();
	}
}
