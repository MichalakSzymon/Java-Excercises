package b_Zadania_Domowe.a_Dzien_3;


public class Main1 {

    public static void main(String[] args) {
    	String a="246";
    	String b="123";
    	try {
    		average(a, b);
    	}
    	catch (ArithmeticException e) {
    		System.out.println("Pamiętaj cholero, nie dziel przez zero");
    	}

    }
    
    static void average(String a, String b) throws ArithmeticException {
    
    	int number = Integer.parseInt(a)/Integer.parseInt(b);
    
    }
    

}
