package threadTest;

public class newThread implements Runnable {
	
	public Thread t;
	
	newThread() {
		t = new Thread( this, "demo thread");
		System.out.println("Child thread1: " + t);
		t.start();
	}
	@Override
	public void run() {
		try {
			int n;
			for ( n = 5; n > 0; n-- ) {
				System.out.println("Child thread1: " + n );
				Thread.sleep(2000);
			}
		} catch ( InterruptedException e) {
			System.out.println("Child thread1 is interrupted!");
		}
		System.out.println("Exiting the child thread1!!");
	}
	
}
