package interfejsy;

public class Main1 {

	public static void main(String[] args) {
		Moveable[] moveableTab = new Moveable[3]; 
		moveableTab[0]= new Cat();
		moveableTab[1] = new Car();
		moveableTab[2] = new Person();
		
		for(Moveable object: moveableTab)
			object.start();
	}

}
