package threadCommunicate;

public class CommunicateMain {
	public static void main(String[] args) {
		QueueClass queueClass = new QueueClass();
		new Producer(queueClass);
		new Consumer(queueClass);

		System.out.println("Press Control-c to stop!");
	}
}
