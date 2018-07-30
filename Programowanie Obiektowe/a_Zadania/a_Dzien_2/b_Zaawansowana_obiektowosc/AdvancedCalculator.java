package a_Zadania.a_Dzien_2.b_Zaawansowana_obiektowosc;

import java.util.Arrays;
import java.util.InputMismatchException;

public class AdvancedCalculator extends Calculator {
	
	final static Double PI=3.14159265;
	
	static double computeCircleArea(double r){
		AddToHistory("Circle area is" + PI*Math.pow(r,2));
		return PI*Math.pow(r,2); 
	}
	
	public void printGlobalOperations(int length) {
		String [] historyLength = new String [length];
		for(int i=0; i<length; i++) historyLength[i]=getHistory()[getHistory().length-(i+1)];		
		System.out.println(Arrays.toString(historyLength));
	}

	public void printGlobalOperations(String length) {
		try {
		int lengthInt = Integer.parseInt(length);
		String [] historyLength = new String [lengthInt];
		for(int i=0; i<lengthInt; i++) historyLength[i]=getHistory()[getHistory().length-(i+1)];		
		System.out.println(Arrays.toString(historyLength));
		}
		catch (InputMismatchException e) {
			System.out.println("Błędny format danych");
		}
	}
}