package a_Zadania.b_Dzien_2.src.main.java;

public class Main {

	public static void main(String[] args) {
		
		Vehicle [] vehicle = new Vehicle [2];
		Car car = new Car(200, "model", "typ");
		vehicle[0]=car;
		Train train = new Train(250, "Pendolino", 1435);
		vehicle[1] = train;
		for(Vehicle veh: vehicle) {
			if(veh.getClass().isAssignableFrom(Inspectionable.class)) {
			System.out.println(veh);
			((Inspectionable)veh).createInspection();
			}
			System.out.println(veh);
		}
		
	}
}
