package b_Zadania_Domowe.a_Dzien_3;


public class Main3 {

    public static void main(String[] args) {
    	String str = "nowystring";
    	try {
    		System.out.println(getLength(str));
    	}
    	catch (NullPointerException e) {
    		System.out.println("Podano pusty wyraz");
    	}

    }
    
    static int getLength(String str) throws NullPointerException {
    	return str.length();
    }
    
}
