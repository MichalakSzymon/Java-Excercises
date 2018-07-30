package a_Zadania.b_Dzien_2.src.main.java;

public class Train extends Vehicle {
	int trackWidth;
	
	
	Train (int maxSpeed, String model, int trackWidth) {
		super(maxSpeed, model);
		setTrackWidth(trackWidth);
	}


	public int getTrackWidth() {
		return trackWidth;
	}


	public void setTrackWidth(int trackWidth) {
		this.trackWidth = trackWidth;
	}


	@Override
	public String toString() {
		return "Train [trackWidth=" + trackWidth + "]";
	}
	
	
}
