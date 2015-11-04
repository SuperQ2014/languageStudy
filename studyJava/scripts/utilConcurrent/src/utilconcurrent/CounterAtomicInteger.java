package utilconcurrent;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

public class CounterAtomicInteger {

	private final static AtomicInteger count = new AtomicInteger(5);
	
	public static void inc() {
		
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			e.getStackTrace();
		}
		
		count.getAndIncrement();
	}
	
	public static void main(String[] args) throws InterruptedException {
		final int threadNum = 100;
		final CountDownLatch latch = new CountDownLatch(threadNum);
		
		for (int i = 0; i < threadNum; i++) {
			new Thread(new Runnable() {
				@Override
				public void run() {
					Counter.inc();
					latch.countDown();
				}
			}).start();
		}
		
		latch.await();
		System.out.println("Counter.count: " + count);
	}
}
