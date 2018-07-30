package a_Zadania.a_Dzien_2.b_Zaawansowana_obiektowosc;

public class testCalculator {

	public static void main(String[] args) {
		AdvancedCalculator calc = new AdvancedCalculator();
		AdvancedCalculator.computeCircleArea(5);
		calc.add(2,3);
		
		calc.printOperations();
		
		AdvancedCalculator calc2 = new AdvancedCalculator();
		AdvancedCalculator.computeCircleArea(5);
		calc2.add(2,3);

		calc2.printOperations();
		

	}

}
