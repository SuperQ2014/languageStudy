package enumexample;

import java.util.EnumMap;

public class EnumMapExample {

	public static void main(String[] args) {
		//Create an EnumMap that contains all constants of the Car enum.
		EnumMap<Car, Integer> cars = new EnumMap<Car, Integer>(Car.class);
		
		//Put some values in the EnumMap.
		cars.put(Car.BMW, Car.BMW.getPrice());
		cars.put(Car.AUDI, Car.AUDI.getPrice());
		cars.put(Car.MERCEDES, Car.MERCEDES.getPrice());
		
		//Print the values of the EnumMap.
		for (Car c : cars.keySet()) {
			System.out.println(c.name());
		}
		System.out.println(cars.size());
		
		//Remove an object.
		cars.remove(Car.AUDI);
		System.out.println("After removing an objcet, the size is: " + cars.size());
		
		//Insert an object.
		cars.put(Car.valueOf("AUDI"), Car.AUDI.getPrice());
		System.out.println("After inserting an object, the size is: " + cars.size());
	}
}
