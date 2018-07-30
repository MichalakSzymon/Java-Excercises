package b_Zadania_Domowe.a_Dzien_3;


public class Main4 {

    public static void main(String[] args) {
    	String str="";
    	try {
    		System.out.println(toInt(str));
    	}
    	catch (NumberFormatException e) {
    		System.out.println("Podano złą wartość");
    	}

    }
    static int toInt(String str) throws NumberFormatException {
    	return Integer.parseInt(str);
    }

}

