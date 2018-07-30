package a_Zadania.a_Dzien_1.a_Wyrazenia_regularne;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main2 {

	private static final Pattern PASSWORD_PATTERN =
		Pattern.compile("(?=[^A-Z]*[A-Z])(?=[^a-z]*[a-z])(?!.*(?:[A-Z]{2}|[a-z]{2}))\\p{Alnum}{10,15}");
		public static void main(String[] args) {
			String password = "aX76666666";
			System.out.println(verifyPassword(password));
		}	
		

	
	
	static boolean verifyPassword(String password) {
		Matcher	matcher	= PASSWORD_PATTERN.matcher(password);
		return matcher.matches();
	}
}

