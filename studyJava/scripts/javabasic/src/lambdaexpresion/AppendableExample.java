package lambdaexpresion;

import java.util.Formatter;
import java.util.Locale;

public class AppendableExample {
	
	private static Formatter formatter;

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		formatter = new Formatter(sb, Locale.CHINA);
		
		formatter.format("%4$2s, %3$2s, %2$2s, %1$2s\n", "a", "b", "c", "d");
		formatter.format(Locale.CHINA, "e = %+10.4f\n", Math.E);
		
		System.out.println(formatter);
		System.out.println(sb);
	}
}
