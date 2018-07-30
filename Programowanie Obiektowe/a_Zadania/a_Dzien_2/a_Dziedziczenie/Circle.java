package a_Zadania.a_Dzien_2.a_Dziedziczenie;


public class Circle extends Shape {
	private double radius;
	
	
	public Circle(int x, int y, String color, double radius) {
		super(x, y, color);
		this.radius=radius;
	};
	
	@Override
	public String getDescription() {
		String str = super.getDescription();
		return str + ", radius:" + radius;
	}
	
	public double getArea() {
		return (double)getX()*(double)getY()*radius/2;
	}
	
	public double getCircuit () {
		return radius*getX();
		
	}
		
}
