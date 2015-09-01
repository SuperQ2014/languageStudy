package threadTest;

public class threadMain {
	public static void main ( String[] args )
	{
		System.out.println("Starting .....");
		
//		Thread t = Thread.currentThread();
//		System.out.println("Current thread is: " + t);
//		
//		//change the name of the thread
//		t.setName("My thread");
//		System.out.println("After name changed: " + t);
//		
//		//Start a new thread
//		newThread childThread1 = new newThread();
//
//		//Start another thread
//		extendNewThread childThread2 = new extendNewThread();
//		
//		System.out.println("Thread one is alive: " + childThread1.t.isAlive());
//		System.out.println("Thread two is alive: " + childThread2.isAlive());
//		//using sleep
//		try {
//			System.out.println("Start join1 ... ");
//			childThread1.t.join();
//			System.out.println("After join1 ... ");
//			System.out.println("Start join2 ... ");
//			childThread2.join();
//			System.out.println("After join2 ... ");
//
//			int n;
//			for ( n = 5; n > 0; n-- ) {
//				System.out.println("Main thread: " + n );
//				Thread.sleep(1000);           
//			}
//		} catch (InterruptedException e) {
//			System.out.println("Main thread is interrupted!");
//		}
//		System.out.println("Thread one is alive: " + childThread1.t.isAlive());
//		System.out.println("Thread two is alive: " + childThread2.isAlive());
//		System.out.println("Exiting the main thread!!");
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		clicker hi = new clicker(Thread.NORM_PRIORITY + 2);
		clicker lo = new clicker(Thread.NORM_PRIORITY - 2);
		
		hi.start();
		lo.start();
		try {
			Thread.sleep(3000);		//主线程等待10s，此时两个子线程正在running，分别对click进行不断加1
		} catch (InterruptedException e) {
			System.out.println("Main thread interrupted.");
		}
		lo.stop();
		hi.stop();
		
		try {
			//hi.t.join();
			lo.t.join();
		} catch ( InterruptedException e ) {
			System.out.println("InterruptionExcetion caught!!");
		}
		
		System.out.println("Low-priority thread:  " + lo.click );
		System.out.println("High-priority thread: " + hi.click );
	}
}
