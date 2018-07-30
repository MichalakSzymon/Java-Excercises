package a_Zadania.a_Dzien_2.a_Dziedziczenie;

import a_Zadania.a_Dzien_1.d_Konstruktor.Calculator;

public class AdvancedCalculator extends Calculator {
	
	public int pow(int num1, int num2) {
		int result = (int)Math.pow((double)num1,(double)num2); 
		String stringAdd =num1 + " ^ " + num2 + " equals " + result;
		this.AddToHistory(stringAdd);
		return result;
}
	public double root(int num1, int num2) {
		double result = Math.pow((double)num1,(double)(1.0/num2)); ; 
		String stringAdd ="Root" + num1 + " of " + num2 + " equals " + result;
		this.AddToHistory(stringAdd);
		return result;
}
	
}
