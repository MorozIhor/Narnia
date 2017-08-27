package Map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import Collections.Car;

public class MainMap {

	public static void main(String[] args) {
		
		Map<String, List<Car>> map = new HashMap<>();
		
		List<Car> cars = new ArrayList<>();
		cars.add(new Car("BMV", 1999, true));
		cars.add(new Car("nisan", 2003, true));
		cars.add(new Car("lotus", 2013, true));
		map.put("simpelCars", cars);
		
		map.put("sportCars", new ArrayList<>());
		map.get("sportCars").add(new Car("ferari", 2010, true));
		map.get("sportCars").add(new Car("lotus", 2013, true));
		
		for (Map.Entry<String, List<Car>> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
			
		}
		System.out.println();
		
		Iterator <Map.Entry<String, List<Car>>> iter = map.entrySet().iterator();
		while(iter.hasNext()){
			Map.Entry<String, List<Car>> carsEntry = iter.next();
			Car car1 = new Car("lotus", 2013, true);
			if(carsEntry.getValue().contains(car1)){
				carsEntry.getValue().remove(car1);
			}
		}
		
		for (Map.Entry<String, List<Car>> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
			
		}
		
		System.out.println("Keys!!!!!!!");
		Set<String> keys = map.keySet();
		for (String string : keys) {
			System.out.println(string);
		}
		System.out.println("Values!!!!!!!");
		Collection<List<Car>> listCars = map.values();
		for (List<Car> list : listCars) {
			System.out.println(list);
		}
	}

}
