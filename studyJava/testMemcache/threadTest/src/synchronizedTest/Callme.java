package synchronizedTest;

public class Callme {
	
	Callme() {
		
	}
	
/*	synchronized public void call1( String msg ) {		//使用synchronized可以防止多个线程调用该同一个方法时，出现竞争情况
		System.out.print("[ " + msg );
		try {
			Thread.sleep(1000);
		} catch ( InterruptedException e ) {
			System.out.println("Interrupted!");
		}
		System.out.println(" ]");
	}*/
	
	public void call2( String msg ) {		//在调用函数中使用synchronized块可以防止多个线程调用该同一个方法时，出现竞争情况
		System.out.print("[ " + msg );
		try {
			Thread.sleep(1000);
		} catch ( InterruptedException e ) {
			System.out.println("Interrupted!");
		}
		System.out.println(" ]");
	}
}
