package interfejsy;

import java.util.ArrayList;
import java.util.List;

public class Main2 {

	public static void main(String[] args) {
		List <Moveable> moveableList = new ArrayList<Moveable>(); 
		moveableList.add(new Cat());
		moveableList.add(new Car());
		moveableList.add(new Person());
	
		for(Moveable object: moveableList)
			object.start();
	}

}
