package enumexample;

import java.util.EnumSet;

public class EnumSetExample {

	public static void main(String[] args) {
		//Create an EnumSet that contains all days of the week.
		EnumSet<Day> days = EnumSet.allOf(Day.class);
		
		//Print the values of an EnumSet.
		for (Day day : days) {
			System.out.println(day.name());
			System.out.println(day.ordinal());
		}
		System.out.println(days.size());
		
		//Remove an object.
		days.remove(Day.MONDAY);
		System.out.println("After removing an object, the size is: " + days.size());
		
		//Insert an object.
		days.add(Day.valueOf("MONDAY"));
		System.out.println("After inserting an object, the size is: " + days.size());
	}
}
