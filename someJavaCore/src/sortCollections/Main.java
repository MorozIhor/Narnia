package sortCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Car> cars = new ArrayList<>();
		Car car1 = new Car("Opel", 2003);
		Car car2 = new Car("Nisan", 2005);
		Car car3 = new Car("Lada", 1999);
		Car car4 = new Car("BMW", 2009);
		
		cars.add(car1);
		cars.add(car2);
		cars.add(car3);
		cars.add(car4);
		
		//Not sorted list
		Iterator<Car> iter = cars.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
		System.out.println("-----------------");
		
		//The sorting rules are described in the compareTo() method in the Car class 
		Collections.sort(cars);
		for (Car car : cars) {
			System.out.println(car);
		}
		System.out.println("------------------");
		
		//Reverses the order of the elements in the specified list.
		Collections.reverse(cars);
		for (Car car : cars) {
			System.out.println(car);
		}
		System.out.println("------------------");
		
		//The sorting rules are described in the CarYearComparator class
		Collections.sort(cars, new CarYearComparator());
		
		for (Car car : cars) {
			System.out.println(car);
		}
		
	}

}
