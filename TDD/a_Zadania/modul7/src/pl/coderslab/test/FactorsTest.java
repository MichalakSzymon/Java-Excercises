package pl.coderslab.test;

import static org.junit.Assert.*;

import org.junit.Test;

import pl.coderslab.Factors;

import java.util.Arrays;
import java.util.List;



public class FactorsTest {

	private static final int TESTED_VALUE = 24;
	private static final List<Integer> FACTORS = Arrays.asList(1, 2, 3, 4, 6, 8, 12, 24);

	@Test
	public void shouldGetCorrectListWithFactors() {
		Factors factors = new Factors();
		assertEquals(FACTORS, factors.generatePrimeFactors(TESTED_VALUE));
	}

}
