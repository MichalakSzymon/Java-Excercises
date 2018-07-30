package b_Zadania_Domowe.a_Dzien_2;

public class Person implements Comparable {

	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	String firstName;
	String lastName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "lastName= " + lastName + " firstName, = " + firstName ;
	}

	@Override
	public int compareTo(Object arg0) {
		return arg0.toString().compareTo(this.lastName);
	}
}