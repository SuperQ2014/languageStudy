package utilconcurrent;

import java.util.concurrent.CountDownLatch;

public class Counter {

	private static int count = 0;
//	private volatile static int count = 0;

	public static void inc() {

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.getStackTrace();
		}
//		synchronized (Counter.class) {
			count++;
//		}
	}

	public static void main(String[] args) throws InterruptedException {
		final CountDownLatch latch = new CountDownLatch(1000);

		for (int i = 0; i < 1000; i++) {
			new Thread(new Runnable() {
				@Override
				public void run() {
					Counter.inc();
					latch.countDown();
				}
			}).start();
		}

		latch.await();
		System.out.println("Counter.count = " + count);
	}
}
