package Collections;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MainSet {

	public static void main(String[] args) {
		
		Set<Car> set = new HashSet<>();
		set.add(new Car("opel", 2003, true));
		set.add(new Car("niva", 2004, false));
		set.add(new Car("BMV", 1999, true));
		set.add(new Car("BMV", 1999, true)); //cannot contain duplicate elements.
		
//		View all elements with an Iterator
		Iterator<Car> iter = set.iterator();
		while(iter.hasNext()){
			Car car = iter.next();
			System.out.println(car);
		}
		
		
		System.out.println(set);
		System.out.println("!!!!!!!!!!!!!");
		set.remove(new Car("niva", 2004, false));
		System.out.println(set);
			
	}

}
