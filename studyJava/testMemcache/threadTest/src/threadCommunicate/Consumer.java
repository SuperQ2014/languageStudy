package threadCommunicate;

public class Consumer implements Runnable {
	QueueClass queueClass;
	
	Consumer(QueueClass queueClass) {
		this.queueClass = queueClass;
		new Thread(this, "Consumer").start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			queueClass.get();
		}
	}

}
