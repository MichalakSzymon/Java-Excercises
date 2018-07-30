package b_Zadania_Domowe.a_Dzien_2;


public class Main3 {
	
	static String upperCase(String str, int index) {
		String result="";
		for(int i=0; i < str.length(); i++) {
	    	
			if (i%index==0)result += Character.toUpperCase(str.charAt(i));
			else result +=str.charAt(i);
		}
		return result;
}

	
    public static void main(String[] args) {
    	String str="Ala ma kota";
    	int index=2;
    	System.out.println(upperCase(str, index));

    }

}
