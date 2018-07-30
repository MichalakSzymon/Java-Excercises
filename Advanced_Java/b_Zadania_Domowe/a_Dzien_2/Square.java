package b_Zadania_Domowe.a_Dzien_2;

public class Square extends Shape {
	private double a;

	public Square (double a) {
		this.a=a;
		this.area=calculateArea();
		this.circuit=calculateCircuit();
	}
	
	public double getA () {
		return this.a;
	}

	@Override
	public double calculateCircuit() {
		return 4*a;
	}

	@Override
	public double calculateArea() {
		return a*a;
	}		
}

