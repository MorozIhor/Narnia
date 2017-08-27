package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainList {

	public static void main(String[] args) {
		
		List<Car> list = new ArrayList<>();
		Car car = new Car("opel", 2003, true);
		list.add(car);
		list.add(new Car("niva", 2004, false));
		list.add(new Car("BMV", 1999, true));
		list.add(new Car("BMV", 1999, true)); //can contain duplicate elements.
		
		System.out.println("Size of collection: " + list.size());
		
		int index = list.indexOf(car);
		System.out.println("Index of element: " + index);
		
//		View all elements with a for each loop
		System.out.println("!!!!!!!!");
		for (Car c : list) {
			System.out.println(c);
		}
		
		System.out.println("!!!!!!!!!!!");
		System.out.println(list.get(1));
//		list.remove(1);
		list.remove(new Car("niva", 2004, false));
		System.out.println(list.get(1));
		
		
		Car [] cars = new Car[2];
		cars[0] = new Car("toyota", 1999, true);
		cars[1] = new Car("nisan", 2001, false);
//		Converting an array to a list
		List<Car> arrayToList = Arrays.asList(cars); 
//		list.add(new Car("opel", 2006, true)); // Can not add new objects
		System.out.println(arrayToList);
		
	}

}
