package pl.coderslab.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import pl.coderslab.First;

public class FirstTest {

	private static String FIRST_STRING_TO_CONCAT = "abc";
	private static String SECOND_STRING_TO_CONCAT = "123";
	private static String CONCATED_TEXT = "abc123";
	private static int COMPUTED_VALUE = 15;
	private static int FIRST_VALUE = 3;
	private static int SECOND_VALUE = 5;
	private static First first;

	@BeforeClass
	public static void beforeClass(){
		first = new First();
	}
	
	@Test
	public void testConcatString() {
		assertEquals(CONCATED_TEXT, first.concatString(FIRST_STRING_TO_CONCAT, SECOND_STRING_TO_CONCAT));
	}

	@Test
	public void testMultiply() {
		assertNotNull(first);
		assertEquals(COMPUTED_VALUE, first.multiply(FIRST_VALUE, SECOND_VALUE));
	}

}