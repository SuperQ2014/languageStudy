package threadtest;

public class extendNewThread extends Thread {
	//构造函数
	extendNewThread() {
		super("Demo thread2");		//调用父类的构造方法，即Thread的构造方法，传入的String参数作为线程名
		System.out.println("Child thread2 : " + this );
		start();
	}
	
	//线程入口，start调用后进入该入口方法
	public void run() {
		try {
			int n;
			for ( n = 5; n > 0; n-- ) {
				System.out.println("Child thread2 : " + n );
				Thread.sleep(3000);
			}
		} catch ( InterruptedException e ) {
			System.out.println("The child thread2 is interrupted!");
		}
		System.out.println("Exiting the child thread2!!");
	}
}
