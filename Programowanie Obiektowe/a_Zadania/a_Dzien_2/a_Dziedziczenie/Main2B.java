package a_Zadania.a_Dzien_2.a_Dziedziczenie;

public class Main2B {

	public static void main(String[] args) {
		Circle circle = new Circle (3, 4, "Yellow", 2.0);
		Shape circle2 = new Circle (3, 5, "Yellow", 2.0);
		
		System.out.println(circle2.getDescription());
		System.out.println(circle.getDistance(circle2));

	}

}
