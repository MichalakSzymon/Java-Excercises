package b_Zadania_Domowe.a_Dzien_2;

import java.util.ArrayList;
import java.util.List;

public class Main3 {

	public static void main(String[] args) {
		List<Shape> list = new ArrayList<>();
		list.add(new Rectangle(2,3));
		list.add(new Square(2));
		list.add(new Circle(3));
		
		
		Shape shape = list.get(0);
		System.out.println("Prostokąt o bokach: " + ((Rectangle) shape).getA() + " i " + ((Rectangle) shape).getB() + " - pole=" + shape.calculateArea() + ", obwód=" + shape.calculateCircuit());
		shape = list.get(1);
		System.out.println("Kwadrat o bokach: " + ((Square) shape).getA() + " i " + ((Square) shape).getA() + " - pole=" + shape.calculateArea() + ", obwód=" + shape.calculateCircuit());
		shape = list.get(2);
		System.out.println("Koło o promieniu: " + ((Circle) shape).getR() + " - pole=" + shape.calculateArea() + ", obwód=" + shape.calculateCircuit());
	}

}
