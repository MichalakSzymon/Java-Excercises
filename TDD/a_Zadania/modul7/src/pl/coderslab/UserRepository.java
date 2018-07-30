package pl.coderslab;

import java.util.HashMap;
import java.util.Map;

public class UserRepository {
	private Map<Integer, User> users;

	public UserRepository() {
		users = new HashMap<Integer, User>();
	}

	public void createNewUser(User user) {
		users.put(user.getId(), user);
	}

	public User getUserWhereId(int id) {
		return users.get(id);
	}
	
	public void deleteUser(int id){
		users.remove(id);
	}
	
	public void editUserSurname(int id, String newSurname){
		User user = users.get(id);
		user.editSurname(newSurname);
	}
}
