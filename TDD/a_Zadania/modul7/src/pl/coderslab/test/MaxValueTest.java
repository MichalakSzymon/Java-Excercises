package pl.coderslab.test;

import static org.junit.Assert.*;

import org.junit.Test;

import pl.coderslab.MaxValue;

public class MaxValueTest {

	private static final int MAX_VALUE = 197;
	private static final int[] TEST_LIST = { 4, 7, 1, 22, MAX_VALUE, 3, 7, 99 };

	@Test
	public void test() {
		MaxValue maxValue = new MaxValue();
		assertEquals(MAX_VALUE, maxValue.largest(TEST_LIST));
	}

}