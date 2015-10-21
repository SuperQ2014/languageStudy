package datetest;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class ParsingAndFormattingExample {

	public static void main(String[] args) {
		
		String in = "20151021";
		LocalDate date = LocalDate.parse(in, DateTimeFormatter.BASIC_ISO_DATE);
		System.out.println(date);
		
		String input = "Mar 23 1994";
		try {
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM d yyyy");
			LocalDate date2 = LocalDate.parse(input, formatter);
			System.out.printf(input + " is formatted to " + date2);
		} catch (DateTimeParseException exc) {
			System.out.printf("%s is not parsable!%n", input);
			throw exc;
		}
	}
}
