package exceptionBasic;

public class ThrowDemo {
	static void demoproc() {
		try {
			System.out.println("Before throw new NullPointerException");
			throw new NullPointerException("demo");
//			System.out.println("After throw new NullPointerException");
		} catch (NullPointerException e) {
			System.out.println("Caught inside demoproc.");
			throw e;
		}
	}
	
	public static void main (String[] args){
		try {
			demoproc();
		} catch (NullPointerException e) {
			System.out.println("Recaught: " + e);
		}
	}
}
