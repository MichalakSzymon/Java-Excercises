package b_Zadania_Domowe.a_Dzien_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main1 {
	
	public static final Pattern PATTERN_SURNAME = Pattern.compile("Kowalsk[ai]");
	public static final Pattern PATTERN_PAYMENT = Pattern.compile("[1-9][0-9]{0,}\\.[0-9]{2}");
	
	public static void main(String[] args) {
		File file = new File("b_Zadania_Domowe/a_Dzien_1/earnings.txt");
		String line = "";
		int index=0;
		try {
			Scanner scan = new Scanner(file);
			while(scan.hasNextLine()) {
				line = scan.nextLine();
				Matcher	matcher	= PATTERN_SURNAME.matcher(line);
				if(!matcher.find()) {
					Matcher matcher2 = PATTERN_PAYMENT.matcher(line);
					if(matcher2.find()) {
						System.out.println(line);
						
					}
				}
			}	
		} catch (FileNotFoundException e) {
			System.out.println("Błąd odczytu pliku");
		}
	}
}
