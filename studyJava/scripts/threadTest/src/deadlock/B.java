package deadlock;

public class B {
	synchronized void barB(A a) {
		String name = Thread.currentThread().getName();
		System.out.println(name + " entered B.bar");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("B interrupted..");
			e.getStackTrace();
		}
		
		System.out.println(name + " trying to call A.last()....");
		a.last();
	}
	
	void last() {
		System.out.println("Inside B.last...");
	}
}
