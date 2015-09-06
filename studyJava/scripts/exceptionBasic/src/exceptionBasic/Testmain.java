package exceptionBasic;

public class Testmain {
	static class Exc1 {
		static void subroutine() {
			int d = 0;
			int a = 11/d;
		}
	}
	public static void main(String[] args) {
		Exc1.subroutine();
	}
}
