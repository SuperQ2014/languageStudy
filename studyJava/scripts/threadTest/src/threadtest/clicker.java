package threadtest;

public class clicker implements Runnable {
	int click = 0;
	Thread t;
	private volatile boolean running = true;
	
	//���췽��
	public clicker( int p ) {
		t = new Thread(this);
		t.setPriority( p );
	}
	//�߳���ڷ���
	public void run() {
		while(running) {
			click ++;
		}
	}
	
	//ֹͣ�̵߳ķ���
	public void stop() {
		running = false;
	}
	
	//�����߳�
	public void start() {
		t.start();
	}

}
