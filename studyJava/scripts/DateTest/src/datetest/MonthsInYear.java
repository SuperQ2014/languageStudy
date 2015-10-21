package datetest;

import java.time.Month;
import java.time.Year;
import java.time.YearMonth;
import java.time.DateTimeException;

import java.io.PrintStream;
import java.lang.NumberFormatException;

public class MonthsInYear {

	public static void main(String[] args) {
		int year = 0;
		
		if (args.length <= 0) {
			System.out.printf("Usage: MonthsInYear <year>%n");
			throw new IllegalArgumentException();
		}
		
		try {
			year = Integer.parseInt(args[0]);
		} catch (NumberFormatException exc) {
			System.out.printf("%s is not a properly formatted number.%n", args[0]);
			throw exc;
		}
		
		try {
			Year testYear = Year.of(year);
		} catch (DateTimeException dtexc) {
			System.out.printf("%s is not a valid year.%n", year);
			throw dtexc;
		}
		
		System.out.printf("For the year %d:%n", year);
		for (Month month : Month.values()) {
			YearMonth ym = YearMonth.of(year, month);
			System.out.printf("%s: %d days%n", month, ym.lengthOfMonth());	
		}
	}
}
