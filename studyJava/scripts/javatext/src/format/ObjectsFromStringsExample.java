package format;

import java.text.MessageFormat;
import java.text.ParsePosition;

public class ObjectsFromStringsExample {

	public static void main(String[] args) {
		MessageFormat messageFormat = new MessageFormat("String: {0}\nInteger: {1}\nDouble: {2}");
		
		Object[] objArray = {"This is a string", new Integer(56), new Double(1.343)};
		String message = messageFormat.format(objArray);
		System.out.println("The message is:\n" + message);
		
		Object[] objs = messageFormat.parse(message, new ParsePosition(0));
		
		System.out.println("\n\nObjects parsed: ");
		for (Object o : objs) {
			System.out.println(o + " of " + o.getClass());
		}
	}
}
