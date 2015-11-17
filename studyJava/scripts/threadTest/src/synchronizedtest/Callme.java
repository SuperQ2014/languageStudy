package synchronizedtest;

public class Callme {

	Callme() {

	}

	//使用synchronized可以防止多个线程调用该同一个方法时，出现竞争情况 
	synchronized public void hasSynCall(String msg) {
		System.out.print("[ " + msg );
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Interrupted!");
			e.getStackTrace();
		}
		System.out.println(" ]");
	}

	public void noSynCall(String msg) {
		System.out.print("[ " + msg);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Interrupted!");
		}
		System.out.println(" ]");
	}
}
