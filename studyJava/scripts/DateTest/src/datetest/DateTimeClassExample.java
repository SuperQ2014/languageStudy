package datetest;

import java.time.*;

public class DateTimeClassExample {

	public static void main(String[] args) {
		
		LocalTime thisSec;
		for (; ;) {
			
			thisSec = LocalTime.now();
			System.out.println(thisSec.getHour() + thisSec.getMinute() + thisSec.getSecond());
		}
	}
}
