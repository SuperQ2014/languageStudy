package threadtest;

public class clicker implements Runnable {
	int click = 0;
	Thread t;
	private volatile boolean running = true;
	
	//构造方法
	public clicker( int p ) {
		t = new Thread(this);
		t.setPriority( p );
	}
	//线程入口方法
	public void run() {
		while(running) {
			click ++;
		}
	}
	
	//停止线程的方法
	public void stop() {
		running = false;
	}
	
	//启动线程
	public void start() {
		t.start();
	}

}
