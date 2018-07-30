package a_Zadania.a_Dzien_1.c_Metody;

public class Main1 {

	public static void main(String[] args) {
		Person person = new Person ();
		person.setName("Jane");
		person.setSurname("Doe");
		person.setAge(0);
		person.setGender("Woman");
		
		person.increaseAge();
		
		System.out.println(person.getFullName());
		System.out.println(person.getAge());
	
	
		Car car = new Car ();
		System.out.println(car.toString());
	}
	
}
