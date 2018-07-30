package pl.coderslab.test;


import static org.junit.Assert.*;

import org.junit.Test;

import pl.coderslab.Circle;
import pl.coderslab.CircleException;

public class CircleTest {

	private static final double RADIUS = 3;
	private static final double NEGATIVE_RADIUS = -3;
	private static final double CIRCLE_AREA = Math.PI * Math.sqrt(RADIUS);
	private static final double DELTA = 0.01;

	@Test
	public void shouldGetCorrectCircleArea() throws CircleException {
		Circle circle = new Circle();
		assertEquals(CIRCLE_AREA, circle.circleArea(RADIUS), DELTA);
	}

	@Test(expected = CircleException.class)
	public void shouldCatchExceptionForParamLessThanZero() throws CircleException {
		Circle circle = new Circle();
		circle.circleArea(NEGATIVE_RADIUS);
	}

}