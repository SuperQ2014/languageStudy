package wechat.javasomething.threadtest;

public class ThreadTest1 {

	private int j;
	public static void main(String[] args) {
		ThreadTest1 tt = new ThreadTest1();
		Inc inc = tt.new Inc();
		Dec dec = tt.new Dec();
		
		for (int i = 0; i < 2; i++) {
			Thread t1 = new Thread(inc);
			t1.start();
			Thread t2 = new Thread(dec);
			t2.start();
		}
	}
	
	private synchronized void inc() throws InterruptedException {
		j++;
		Thread.sleep(5000);
		System.out.println(Thread.currentThread().getName() + "-inc: " + j);
	}
	
	private synchronized void dec() throws InterruptedException {
		j--;
		Thread.sleep(1000);
		System.out.println(Thread.currentThread().getName() + "-dec:" + j);
	}
	
	class Inc implements Runnable {
		@Override
		public void run() {
			try {
				inc();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		Inc() {
			System.out.println("Into Inc class's constructor function.");
		}
	}
	class Dec implements Runnable {
		@Override
		public void run() {
			try {
				dec();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		Dec() {
			System.out.println("Into Dec class's constructor function.");
		}
	}
}
