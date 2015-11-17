package skyler.tao.guavatest;

import java.util.Optional;	//jdk1.8支持了Optional类

public class WithGuavaSuccess {

	public static void main(String[] args) {
		
		WithGuavaSuccess myGuavaClass = new WithGuavaSuccess();
		
		Integer invalidInput = null;
//		Optional<Integer> a = Optional.of(invalidInput);
		Optional<Integer> a1 = Optional.ofNullable(invalidInput);
		Optional<Integer> b = Optional.of(new Integer(3));
		System.out.println(myGuavaClass.sum(a1, b));
	}
	
	public Integer sum(Optional<Integer> a, Optional<Integer> b) {
		
		return a.orElse(new Integer(0)) + b.get();
	}
}
