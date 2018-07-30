package b_Zadania_Domowe.a_Dzien_2;

public class Main6 {
	static String replaceStr(String str, String forReplace, String replacement) {
		String newStr=str.replace(forReplace, replacement);
		return newStr;
	}

	public static void main(String[] args) {
		String forReplace="ala";
		String replacement="ALA";
		String str="ala ma kota. ala ALA";
		System.out.println(replaceStr(str, forReplace, replacement));
    }

}
