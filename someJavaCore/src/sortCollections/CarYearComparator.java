package sortCollections;

import java.util.Comparator;

public class CarYearComparator implements Comparator<Car> {

	@Override
	public int compare(Car o1, Car o2) {
		Integer year1 = o1.getYear();
		Integer year2 = o2.getYear();
		return year1.compareTo(year2);
	}

}
