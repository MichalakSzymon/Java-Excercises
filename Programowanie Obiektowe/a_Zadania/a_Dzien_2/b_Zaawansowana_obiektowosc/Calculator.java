package a_Zadania.a_Dzien_2.b_Zaawansowana_obiektowosc;

import java.util.Arrays;

public class Calculator {
	
	static private String [] history={}; 
	
	public String [] getHistory() {
		return history;
	}
	
	public int add(int num1, int num2) {
		int result = num1+num2; 
		String stringAdd = "Added " + num1 + " to " + num2 + " got " + result;
		Calculator.AddToHistory(stringAdd);
		return result;
	}
	
	public int multiply(int num1, int num2) {
		int result = num1*num2;
		String stringMultiply = "Multiplied " + num1 + " with " + num2 + " got " + result;
		Calculator.AddToHistory(stringMultiply);
		return result;
	}
	
	public int subtract(int num1, int num2) {
		int result = num1-num2;
		String stringSubtract = "Subtracted " + num1 + " from " + num2 + " got " + result;
		Calculator.AddToHistory(stringSubtract);
		return result;
	}
	
	public double divide(int num1, int num2) {
		double result = num1/num2;
		String stringDivide = "Divide " + num1 + " by " + num2 + " got " + result;
		Calculator.AddToHistory(stringDivide);
		return result;
	}
	
	public Calculator () {
	}
	
	static protected void AddToHistory (String string) {
		Calculator.history=Arrays.copyOf(Calculator.history, Calculator.history.length+1);
		Calculator.history[Calculator.history.length-1]=string;
	
	}
	
	public void printOperations () {
		System.out.println(Arrays.toString(Calculator.history));
	}
	
	public void clearOperations() {
		Calculator.history = new String[0]; 
	}


public static void main (String [] args) {
	Calculator calc = new Calculator();
	calc.add(2, 2);
	calc.multiply(2, 2);
	calc.printOperations();
	calc.clearOperations();
	calc.printOperations();
	}
}