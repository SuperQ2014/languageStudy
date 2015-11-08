package skyler.tao.soa.loadbalance;

public class SynchronizedVariableTest implements Runnable {
	
	private final static String sync = "hello";
	private String methodType = "";
	
	SynchronizedVariableTest(String methodType) {
		
		this.methodType = methodType;
	}
	
	private static void method(String str) {
		synchronized (sync) {
//			sync = str;
			System.out.println(sync);
			while(true);
		}
	}
	
	public void method() {
		method("method");
	}
	
	public static void staticMethod() {
		method("staticmethod");
	}

	@Override
	public void run() {
		
		if (methodType.equals("static")) {
			staticMethod();
		} else if (methodType.equals("nonstatic")) {
			method();
		}
	}
	
	public static void main(String[] args) {
		SynchronizedVariableTest sample1 = new SynchronizedVariableTest("nonstatic");
		SynchronizedVariableTest sample2 = new SynchronizedVariableTest("static");
		new Thread(sample1).start();
		new Thread(sample2).start();
	}
}
