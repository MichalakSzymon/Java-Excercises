package b_Zadania_Domowe.a_Dzien_2;

public class Rectangle extends Shape {
	private double a;
	private double b;
	
	public Rectangle (double a, double b) {
		this.a=a;
		this.b=b;
		this.area=calculateArea();
		this.circuit=calculateCircuit();
	}
	
	public double getA () {
		return this.a;
	}
	
	public double getB () {
		return this.b;
	}

	@Override
	public double calculateCircuit() {
		return 2*a+2*b;
	}

	@Override
	public double calculateArea() {
		return a*b;
	}		
}