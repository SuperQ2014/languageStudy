package datetest;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;


public class DateTest {
	public static void main(String[] args) {
//		LocalDate localDate = new LocalDate(0, 0, 3);
//		System.out.println(localDate);
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		System.out.println(dateFormat.format(date));
	}
}
