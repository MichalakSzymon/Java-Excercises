package a_Zadania.b_Dzien_2.src.main.java;

class Car extends Vehicle implements Inspectionable {
	String type;
	
	
	Car (int maxSpeed, String model, String type) {
		super(maxSpeed, model);
		setType(type);
	}
	
	public void setType (String type) {
		this.type=type;
	}
	
	public String getType () {
		return type;
	}
	
	@Override
	public String toString() {
		return super.toString() + " , type: " + getType();
	}

	@Override
	public void createInspection() {
		System.out.println("Model: " + getModel() + " - sprawdzony");	
	}
}


