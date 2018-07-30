package pl.coderslab;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class Calculator {
	public double sum(double a, double b) {
		return a + b;
	}

	public double divide(double a, double b) throws CalculatorException {
		if (b == 0) {
			throw new CalculatorException("can't divide than zero");
		}
		return a / b;
	}

	public double substract(double a, double b) {
		return a - b;
	}

	public double multiplication(double a, double b) {
		return a * b;
	}

	public boolean greater(double a, double b) {
		if (a < b)
			return true;
		return false;
	}

	public int eval(String value) {
		Expression e = new ExpressionBuilder(value).build();
		return (int) e.evaluate();
	}
}