package objecttest;

import java.lang.Object;

public class ObjectTest {
	public static void main(String[] args) {
		 Object newObject = new Object();
		 Object anotherObject = new Object();
		 boolean isEqual = newObject.equals(anotherObject);
		 System.out.println("Start to test method equals():");
		 System.out.println(isEqual);
		 try {
			 System.out.println(newObject.equals(newObject.clone()));	//clone is protected!
		 } catch (Exception e) {
			 e.printStackTrace();
		 }
		 System.out.println("===========");
		 System.out.println(newObject.hashCode());
	}
}
