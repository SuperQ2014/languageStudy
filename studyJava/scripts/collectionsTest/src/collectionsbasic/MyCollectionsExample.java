package collectionsbasic;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class MyCollectionsExample {

	public static void main(String[] args) {

		List<Double> temperatureList = new ArrayList<Double>();

		temperatureList.add(33.9);
		temperatureList.add(37.8);
		temperatureList.add(40.5);
		temperatureList.add(15.3);
		temperatureList.add(25.6);

		// Print elements of temperatureList
		System.out.println(temperatureList);

		// Get maximum temperature from temperatureList
		Double max = Collections.max(temperatureList);
		System.out.println("The max is: " + max);

		// Get minimum temperature from temperatureList
		Double min = Collections.min(temperatureList);
		System.out.println("The min is: " + min);
		
		//Reverse the list
		Collections.reverse(temperatureList);
		System.out.println(temperatureList);
		
		//Copy elements from one list to another
		List<Double> newTemperatureList = new ArrayList<Double>(temperatureList.size());
		newTemperatureList.add(13.6);
		newTemperatureList.add(23.1);
		newTemperatureList.add(15.9);
		newTemperatureList.add(3.6);
		newTemperatureList.add(43.6);
		newTemperatureList.add(23.6);
		newTemperatureList.add(10.1);
		newTemperatureList.add(13.5);
		
		System.out.println("The newTemperatureList is: " + newTemperatureList);
		Collections.copy(newTemperatureList, temperatureList);
		System.out.println("New temperatureList after copy: " + newTemperatureList);
		
		//Replace all occurrences of one specified value in a list with another
		Collections.replaceAll(newTemperatureList, 40.5, 11.11);
		System.out.println("The newTemperatureList is: " + newTemperatureList);

		//swap newTemperatureList
		Collections.swap(newTemperatureList, 2, 3);
		System.out.println("The newTemperatureList is: " + newTemperatureList);
		
	}
}
