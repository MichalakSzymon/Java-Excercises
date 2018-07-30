package a_Zadania.a_Dzien_1.a_kolekcje_1;

import java.util.ArrayList;
import java.util.List;

public class Main3 {
	public static List<City> initialize() {
		List <City> list = new ArrayList<>();
		
		list.add(new City("Wroclaw", 400000));
		list.add(new City("Opole", 33000));
		list.add(new City("Krakow", 213000));
		list.add(new City("Olsztyn", 90000));
		list.add(new City("Warszawa", 500000));
	return list;
	}
	
	public static List<City> sublist(List<City> list, int start, int end ) {
		return list.subList(start, end);
	}
	
}
