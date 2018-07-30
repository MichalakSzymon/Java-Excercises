package pl.coderslab;

public class Circle {

	private static final int ROUND_FACTOR = 100;

	public double circleArea(double r) throws CircleException {
		if (r < 0)
			throw new CircleException("cannot compute circle area for params lower than zero");
		return Math.ceil(Math.PI * Math.sqrt(r) * ROUND_FACTOR) / ROUND_FACTOR;
	}
}