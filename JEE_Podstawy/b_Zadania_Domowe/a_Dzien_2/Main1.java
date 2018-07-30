package b_Zadania_Domowe.a_Dzien_2;


public class Main1 {
	
	static String encode(String str) {
		StringBuilder strB = new StringBuilder(str);
		int shift = 6;
		for (int i = 0; i < strB.length(); i ++)
		    strB.setCharAt(i, (char) (strB.charAt(i) + shift));
		return strB.toString();
	}
	
    public static void main(String[] args) {
    	String str = "abcde olkjp";
    	System.out.println(encode(str));

    }

}
