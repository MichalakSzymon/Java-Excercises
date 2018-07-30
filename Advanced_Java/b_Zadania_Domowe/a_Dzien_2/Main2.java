package b_Zadania_Domowe.a_Dzien_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main2 {
	
	public static void main(String[] args) {
		List <Person> people = new ArrayList <Person>();
		people.add(new Person("z", "z"));
		people.add(new Person("b", "b"));
		people.add(new Person("f", "f"));
		people.add(new Person("x", "x"));
		people.add(new Person("y", "y"));
		
		Collections.sort(people);
		for(Person person: people)
			System.out.println(person.toString());
	}
}


















