package a_Zadania.b_Dzien_2.src.main.java;

abstract class Vehicle {
	private Integer maxSpeed;
	private String model;
	
	
	Vehicle (int maxSpeed, String model) {
		setMaxSpeed(maxSpeed);
		setModel(model);
	}
	
	void setMaxSpeed (int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	void setModel (String model) {
		this.model = model;
	}
	
	public Integer getMaxSpeed() {
		return maxSpeed;
	}

	public String getModel() {
		return model;
	}

	@Override
	public String toString () {
		return "Class " + getClass().getSimpleName() + ", model: " + getModel() + " speed: " + getMaxSpeed();
	}
}