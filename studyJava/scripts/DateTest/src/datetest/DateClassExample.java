package datetest;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;
import java.time.Year;
import java.time.YearMonth;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.TemporalAdjuster;

public class DateClassExample {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.of(2015, Month.OCTOBER, 21);
		System.out.println(date);
		LocalDate nextWed = date.with(TemporalAdjusters.next(DayOfWeek.WEDNESDAY));
		System.out.println(nextWed);
		
		DayOfWeek dayOfWeek = LocalDate.of(2015, Month.OCTOBER, 22).getDayOfWeek();
		System.out.println(dayOfWeek);
		
		//using a TemporalAdjuster to retrieve the first Wednesday
		LocalDate yesterdayDate = LocalDate.of(2015, Month.OCTOBER, 20);
		TemporalAdjuster adj = TemporalAdjusters.next(DayOfWeek.WEDNESDAY);
		LocalDate nextWednesday = yesterdayDate.with(adj);
		System.out.printf("For the yesterday %s, the next wednesday date is: %s%n", yesterdayDate, nextWednesday);
		
		//YearMonth class example
		YearMonth dateNow = YearMonth.now();
		System.out.printf("%s: %d%n", dateNow, dateNow.lengthOfMonth());
		YearMonth dateNow2 = YearMonth.of(2015, Month.APRIL);
		System.out.printf("%s: %d%n", dateNow2, dateNow2.lengthOfMonth());
		
		//MonthDay
		System.out.println(MonthDay.of(Month.FEBRUARY, 29).isValidYear(2010));
		//Year
		System.out.println(Year.of(2015).isLeap());
	}
}
