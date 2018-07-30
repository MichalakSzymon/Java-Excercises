package b_Zadania_Domowe.a_Dzien_2;

public class Circle extends Shape {
	private double r;
	private final double PI = Math.PI;

	public Circle (double r) {
		this.r=r;
		this.area=calculateArea();
		this.circuit=calculateCircuit();
	}
	
	public double getR () {
		return this.r;
	}

	@Override
	public double calculateCircuit() {
		return 2*PI*r;
	}

	@Override
	public double calculateArea() {
		return r*r*PI;
	}		
}