package deadlock;

public class DeadlockMain implements Runnable {
	A a = new A();
	B b = new B();
	
	DeadlockMain() {
		Thread.currentThread().setName("MainThread");
		new Thread(this, "RacingThread").start();
		
		a.fooA(b);
		System.out.println("Back in main thread");
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		b.barB(a);
		System.out.println("Back in other thread");
	}
	
	public static void main (String[] args) {
		new DeadlockMain();
	}
	
}
