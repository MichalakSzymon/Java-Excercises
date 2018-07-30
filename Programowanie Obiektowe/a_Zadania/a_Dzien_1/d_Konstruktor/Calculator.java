package a_Zadania.a_Dzien_1.d_Konstruktor;

import java.util.Arrays;

public class Calculator {
	
	private String [] history; 
	
	public int add(int num1, int num2) {
		int result = num1+num2; 
		String stringAdd = "Added " + num1 + " to " + num2 + " got " + result;
		this.AddToHistory(stringAdd);
		return result;
	}
	
	public int multiply(int num1, int num2) {
		int result = num1*num2;
		String stringMultiply = "Multiplied " + num1 + " with " + num2 + " got " + result;
		this.AddToHistory(stringMultiply);
		return result;
	}
	
	public int subtract(int num1, int num2) {
		int result = num1-num2;
		String stringSubtract = "Subtracted " + num1 + " from " + num2 + " got " + result;
		this.AddToHistory(stringSubtract);
		return result;
	}
	
	public double divide(int num1, int num2) {
		double result = num1/num2;
		String stringDivide = "Divide " + num1 + " by " + num2 + " got " + result;
		this.AddToHistory(stringDivide);
		return result;
	}
	
	public Calculator () {
		this.history = new String[0];
	}
	
	protected void AddToHistory (String string) {
		this.history=Arrays.copyOf(this.history, this.history.length+1);
		this.history[this.history.length-1]=string;
	
	}
	
	public void printOperations () {
		System.out.println(Arrays.toString(this.history));
	}
	
	public void clearOperations() {
		this.history = new String[0]; 
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