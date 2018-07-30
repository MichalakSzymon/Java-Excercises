package b_Zadania_Domowe.a_Dzien_2;


public class Main5 {
	
	static String replaceChar(String str, char forReplace, char replacement) {
		String newStr=str.replace(forReplace, replacement);
		return newStr;
	}

	public static void main(String[] args) {
		char forReplace='a';
		char replacement='A';
		String str="Ala ma kota";
		System.out.println(replaceChar(str, forReplace, replacement));
    }

}
