package b_Zadania_Domowe.a_Dzien_1;

public class Main1 {

	static double dogAge(double dogAge) {
		if(dogAge<=2) return dogAge*10.5;
		else return (dogAge-2)*4+2*10.5;
		
	}
	
    public static void main(String[] args) {
	System.out.println(dogAge(3.5));	

    }

}
