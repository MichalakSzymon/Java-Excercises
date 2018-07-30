package a_Zadania.b_Dzien_2.src.main.java;

abstract class User {
	private String username;
	protected String password;
	protected int age;
	
	abstract boolean checkLogin(String username, String password);
	
	
	void setUsername (String login) {
		this.username = login;
	}
	
	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public int getAge() {
		return age;
	}

	abstract boolean setPassword (String password);
	
	abstract boolean setAge (int age); 
	
	final boolean login (String username, String password) {
		if(checkLogin(username, password) && setAge(this.age)) {
		System.out.println("Logowanie się powiodło");
		return true;	
	}
	System.out.println("Logowanie nie powiodło się");
	return false;
		
	}
}