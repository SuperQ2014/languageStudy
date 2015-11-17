package synchronizedtest;

public class Caller implements Runnable {
	
	private final String msg;
	private final Callme target;
	private final Thread thread;
	
	public Thread getThread() {
		return thread;
	}
	public Caller( Callme targ, String s ) {
		target = targ;
		msg = s;
		thread = new Thread(this);
		thread.start();
	}
	@Override
	public void run() {
		target.noSynCall(msg);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		synchronized (target) {
			target.hasSynCall(msg);			
		}
	}
	
}
