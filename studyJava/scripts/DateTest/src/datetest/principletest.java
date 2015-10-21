package datetest;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;

public class principletest {

	public static void main(String[] args) {

		LocalDate today = LocalDate.now();
		System.out.println(today);
		LocalDate payday = today.with(TemporalAdjusters.lastDayOfMonth()).minusDays(2);
		System.out.println(payday);
		
		LocalDate dateOfBirth = LocalDate.of(1990, Month.SEPTEMBER, 6);
		LocalDate firstBirthDay = dateOfBirth.plusYears(1);
		System.out.println(dateOfBirth + "   " + firstBirthDay);
		
		//DayOfWeek Enum
		DayOfWeek dow = DayOfWeek.MONDAY;
		Locale locale = Locale.getDefault();
		System.out.println(dow.getDisplayName(TextStyle.FULL, locale));
		System.out.println(dow.getDisplayName(TextStyle.SHORT, locale));
		System.out.println(dow.getDisplayName(TextStyle.NARROW, locale));
		
		//Month Enum
		System.out.println(Month.FEBRUARY.maxLength());
		Month month = Month.SEPTEMBER;
		Locale locale2 = Locale.getDefault();
		System.out.println(month.getDisplayName(TextStyle.FULL, locale2));
		System.out.println(month.getDisplayName(TextStyle.SHORT, locale2));
		System.out.println(month.getDisplayName(TextStyle.NARROW, locale2));
		
	}
}
