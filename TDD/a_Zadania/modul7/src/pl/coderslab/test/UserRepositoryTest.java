package pl.coderslab.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import pl.coderslab.User;
import pl.coderslab.UserRepository;

public class UserRepositoryTest {

	private static UserRepository userRepository;
	private static final int CREATED_USER_ID = 1001;
	private static final int DELETED_USER_ID = 1002;
	private static final int EDITED_USER_ID = 1003;
	private static final String USER_NAME = "John";
	private static final String USER_SURNAME = "Doe";
	private static final String NEW_USER_SURNAME = "Smith";

	@BeforeClass
	public static void beforeClass() {
		userRepository = new UserRepository();
	}

	@Test
	public void shouldCreateUser() {
		// given
		User user = new User(CREATED_USER_ID, USER_NAME, USER_SURNAME);
		// when
		userRepository.createNewUser(user);
		// then
		assertSame(user, userRepository.getUserWhereId(CREATED_USER_ID));
	}

	@Test
	public void shouldDeleteUser() {
		// given
		userRepository.createNewUser(new User(DELETED_USER_ID, USER_NAME, USER_SURNAME));
		// when
		userRepository.deleteUser(DELETED_USER_ID);
		// then
		assertNull(userRepository.getUserWhereId(DELETED_USER_ID));

	}

	@Test
	public void shouldEditUser() {
		// given
		userRepository.createNewUser(new User(EDITED_USER_ID, USER_NAME, USER_SURNAME));
		// when
		userRepository.editUserSurname(EDITED_USER_ID, NEW_USER_SURNAME);
		User user = userRepository.getUserWhereId(EDITED_USER_ID);
		// then
		assertEquals(NEW_USER_SURNAME, user.getSurname());
	}

}