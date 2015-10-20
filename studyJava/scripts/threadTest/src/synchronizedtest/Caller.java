package synchronizedtest;

public class Caller implements Runnable {
	String msg;
	Callme target;
	Thread t;
	
	public Caller( Callme targ, String s ) {
		target = targ;
		msg = s;
		t = new Thread(this);
		t.start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
//		target.call1(msg);
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		synchronized (target) {
			target.call2(msg);			
		}
	}
	
}
