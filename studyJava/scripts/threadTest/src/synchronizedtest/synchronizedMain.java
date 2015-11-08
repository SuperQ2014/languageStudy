package synchronizedtest;

public class synchronizedMain {
	public static void main(String[] args) {
		Callme target = new Callme();
		Caller obj1 = new Caller(target, "Hello");
		Caller obj2 = new Caller(target, "Synchronized!");
		Caller obj3 = new Caller(target, "World");
		
		try {
			obj1.getThread().join();
			obj2.getThread().join();
			obj3.getThread().join();
		} catch ( InterruptedException e ) {
			e.getStackTrace();
		}
	}
}
