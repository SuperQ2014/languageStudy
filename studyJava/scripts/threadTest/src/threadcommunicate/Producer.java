package threadcommunicate;

public class Producer implements Runnable {
	QueueClass queueClass;
	
	Producer(QueueClass queueClass) {
		this.queueClass = queueClass;
		new Thread(this, "Producer").start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i = 0;
		
		while(true) {
			queueClass.put(i++);
		}
	}

}
