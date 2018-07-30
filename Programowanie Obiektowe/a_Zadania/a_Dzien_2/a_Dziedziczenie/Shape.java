package a_Zadania.a_Dzien_2.a_Dziedziczenie;


public class Shape {
	private int x;
	private int y;
	private String color;
	
	public Shape (int x, int y, String color) {
		this.x=x;
		this.y=y;
		this.color=color;
	}
	
	public String getDescription() {
		return color + " shape: x=" + x + ", y=" +y;
	}
	
	public double getDistance(Shape shape) {
		double distance = Math.sqrt(Math.pow(((double)(this.x-shape.x)),2)+Math.pow(((double)(this.y-shape.y)),2));
		return distance;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public String getColor() {
		return color;
	}
	
	
}
