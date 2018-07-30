package a_Zadania.a_Dzien_1.d_Konstruktor;

public class Person {
	private String name;
	private String surname;
	private int age;
	private String gender;
	
	Person(String name, String surname) {
		this.name=name;
		this.surname=surname;
	};
	
	Person (String name, String surname, int age) {
		this.name=name;
		this.surname=surname;
		this.age=age;
	}
	
	Person (String name, int age) {
		this.name=name;
		this.age=age;
	}
	
}
