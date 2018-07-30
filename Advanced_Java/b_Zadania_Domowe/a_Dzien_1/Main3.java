package b_Zadania_Domowe.a_Dzien_1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main3 {
	 static boolean verifyLogin(String email) {
		 Pattern patternEmail = Pattern.compile("[^0-9][A-Za-z0-9_-]{5,}");
		 Matcher matcher = patternEmail.matcher(email);
			return matcher.matches();
	 }
	 public static void main(String[] args) {
		String login = "aaAaa3333";
		System.out.println(verifyLogin(login));
	}
}