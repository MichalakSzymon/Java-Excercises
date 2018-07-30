package b_Zadania_Domowe.a_Dzien_2;


public class Main2 {

	static String encode(String str, int shift) {
		StringBuilder strB = new StringBuilder(str);;
		for (int i = 0; i < strB.length(); i ++)
		    strB.setCharAt(i, (char) (strB.charAt(i) + shift));
		return strB.toString();
	}
	
	static String decode(String str, int shift) {
		StringBuilder strB = new StringBuilder(str);;
		for (int i = 0; i < strB.length(); i ++)
		    strB.setCharAt(i, (char) (strB.charAt(i) - shift));
		return strB.toString();
	}
	
    public static void main(String[] args) {
    	String str = "abcde olkjp";
    	int shift=6;
    	System.out.println(encode(str, shift));
    	System.out.println(decode(encode(str, shift), shift));
    }

}
