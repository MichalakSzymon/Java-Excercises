package a_Zadania.a_Dzien_1.c_Metody;

public class Person {
	
	private String name="John";
	private String surname="Doe";
	private Integer age = 0;
	private String gender = "men";
	
	public void setName(String name) {
		this.name = name;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getFullName() {
		return name + " " + surname;
	}
	
	public int getAge () {
		return age;
	}
	
	public void increaseAge () {
		this.age+=1;
	}

}


	