package stringbasic;

public class Example8_1 {

	public static void main(String[] args) {
		String s1, s2;
		s1 = new String("hello1");
		s2 = new String("hello1");
		System.out.println(s1.equals(s2));
		System.out.println(s1 == s2);
		
		String s3, s4;
		s3 = "world1";
		s4 = "world1";
		System.out.println(s3.equals(s4));
		System.out.println(s3 == s4);
		
		System.out.println(s3.startsWith("wor"));
		System.out.println(s4.endsWith("1"));
		
		String str = "abcde";
		System.out.println(str.compareTo("boy"));
		System.out.println(str.compareTo("aba"));
		System.out.println(str.compareTo("abcde"));
		
		
	}
}
