package a_Zadania;

public class Client extends User {
	public Client() {
	}

	@Override
	boolean checkLogin(String username, String password) {
		if(setPassword(password) && username.length()>0) {
			return true;	
		}
		return false;
	}

	@Override
	boolean setPassword(String password) {
		if(password.length()>7) {
			this.password = password;
			return true; 
			}
			return false;
	}

	@Override
	boolean setAge(int age) {
		if (age>18) {
			this.age = age;
			return true;
		}
		return false;
	}
}