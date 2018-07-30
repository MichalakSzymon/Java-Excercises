package pl.coderslab.test;

import org.junit.Test;

import pl.coderslab.SimpleCalculator;

public class SimpleCalculatorTest {

	@Test(expected = IllegalArgumentException.class)
	public void shouldCatchIllegalArgumentException() {
		SimpleCalculator simpleCalculator = new SimpleCalculator();
		simpleCalculator.addPositve(-1, 0);
	}

}
