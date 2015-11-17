package skyler.tao.guavatest;

import com.google.common.base.Preconditions;


public class PreconditionTest {

	public static void main(String[] args) {
		
		PreconditionTest myTestClass = new PreconditionTest();
		
		try {
			System.out.println(myTestClass.sqrt(-3.0));
		} catch (IllegalArgumentException e){
			System.out.println("IllegalArgumentException occurs:");
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		try {
			System.out.println(myTestClass.sum(null, 30));
		} catch (NullPointerException e) {
			System.out.println("NullPointerException occurs:");
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		try {
			System.out.println(myTestClass.getValue(7));
		} catch (IndexOutOfBoundsException e) {
			System.out.println("IndexOutOfBoundsException occurs:");
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	
	public double sqrt(double input) throws IllegalArgumentException {
		
		Preconditions.checkArgument(input > 0, "IllegalArgument: %s", input);
		return Math.sqrt(input);
	}
	
	public int sum(Integer a, Integer b) {
		
		a = Preconditions.checkNotNull(a, "Must not null: %s", a);
		b = Preconditions.checkNotNull(b, "Must not null: %s", b);
		return a + b;
	}
	
	public int getValue(int index) {
		int[] array = {1,2,3,4,5};
		Preconditions.checkElementIndex(index, array.length, "Must in the bounder!");
		return array[index];
	}
}
