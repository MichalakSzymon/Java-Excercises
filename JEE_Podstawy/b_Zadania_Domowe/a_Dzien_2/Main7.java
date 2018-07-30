package b_Zadania_Domowe.a_Dzien_2;
import java.util.Arrays;

public class Main7 {
	
	static String censor(String str, String[] words) {
		
		String[] parts = str.split(" ");
		for (int i=0; i<parts.length; i++)
		{	
			for (int j=0; j<words.length-1; j++)
				if(parts[i].equals(words[j])) parts[i]="****";
		}
		String newStr = String.join(" ", parts);;
		return newStr;
		}
    
	public static void main(String[] args) {
		String str="Dozwolone od 18 lat 18";
		String [] words={"18", "19", "21"};
		System.out.println(censor(str, words));

    }

}



//1. Metoda:
//
//* rozbije łańcuch tekstowy na tablicę wyrazów,
//* sprawdzi, czy nie znajdują się w nim słowa niedozwolone zawarte w tablicy `words`,
//* jeśli tak -- zamieni je na cztery gwiazdki (****)
//* ponownie połączy tablicę w string i zwróci wartość.