package pl.coderslab.test;

import static org.junit.Assert.*;
import org.junit.Test;
import pl.coderslab.Calculator;
import pl.coderslab.CalculatorException;


public class CalculatorTest {

	private static final double A_PARAM = 30;
	private static final double B_PARAM = 20;
	private static final double ZERO_VALUE = 0;
	private static final double EXPECTED_DELTA = 0.01;
	private static final double EXPECTED_SUM = 50;
	private static final double EXPECTED_SUBSTRACT = 10;
	private static final double EXPECTED_MULTIPLE = 600;
	private static final double EXPECTED_DIVIDE = 1.5;

	@Test
	public void shouldGetCorrectSum() {
		Calculator calculator = new Calculator();
		assertEquals(EXPECTED_SUM, calculator.sum(A_PARAM, B_PARAM), EXPECTED_DELTA);
	}

	@Test
	public void shouldGetCorrectSubstract() {
		Calculator calculator = new Calculator();
		assertEquals(EXPECTED_SUBSTRACT, calculator.substract(A_PARAM, B_PARAM), EXPECTED_DELTA);
	}

	@Test
	public void shouldGetCorrectMultiplication() {
		Calculator calculator = new Calculator();
		assertEquals(EXPECTED_MULTIPLE, calculator.multiplication(A_PARAM, B_PARAM), EXPECTED_DELTA);
	}

	@Test
	public void shouldGetCorrectDivide() throws CalculatorException {
		Calculator calculator = new Calculator();
		assertEquals(EXPECTED_DIVIDE, calculator.divide(A_PARAM, B_PARAM), EXPECTED_DELTA);
	}

	@Test(expected = CalculatorException.class)
	public void shouldGetComputeException() throws CalculatorException {
		Calculator calculator = new Calculator();
		assertEquals(ZERO_VALUE, calculator.divide(A_PARAM, ZERO_VALUE), EXPECTED_DELTA);
	}

	@Test
	public void shouldGetFalseForGreater() {
		Calculator calculator = new Calculator();
		assertFalse(calculator.greater(A_PARAM, B_PARAM));
	}

	@Test
	public void evaluatesExpression() {
		Calculator calculator = new Calculator();
		int sum = calculator.eval("1+2+3");
		assertEquals(6, sum);
	}

}
