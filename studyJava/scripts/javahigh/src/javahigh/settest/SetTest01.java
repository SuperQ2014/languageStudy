package javahigh.settest;

import java.util.HashSet;

//import org.apache.log4j.Logger;

public class SetTest01 {
	
//	private static Logger logger = Logger.getLogger(SetTest01.class);

	public static void main(String[] args) {
		HashSet hashSet = new HashSet();
		hashSet.add("name");
		System.out.println(hashSet.add("name"));
		System.out.println(hashSet.add("anotherName"));
		
		String str1 = new String("city");
		String str1_2 = new String("city");
		System.out.println(str1.equals(str1_2));		//true
		String str2 = new String("country");
		System.out.println(str1.hashCode());
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str2.hashCode());
	}
}
