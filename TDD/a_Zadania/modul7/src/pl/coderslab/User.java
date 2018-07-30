package pl.coderslab;

public class User {

	private int id;
	private String name;
	private String surname;

	public User(int id, String name, String surmame) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surmame;
	}

	public void editSurname(String newSurname) {
		surname = newSurname;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

}
