package skyler.tao.guavatest;

public class NoGuavaNullException {

	public static void main(String[] args) {
		
		NoGuavaNullException tester = new NoGuavaNullException();
		
		Integer a = null;
		Integer b = new Integer(3);
		System.out.println(tester.sum(a, b));
	}
	
	public Integer sum(Integer a, Integer b) {
		
		return a + b;
	}
}
