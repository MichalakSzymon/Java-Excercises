package a_Zadania.a_Dzien_1.c_Metody;

public class Car {
	private String brand;
	private String model;
	private float price;
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getBrand() {
		return brand;
	}
	public String getModel() {
		return model;
	}
	public float getPrice() {
		return price;
	}
	
	@Override
	public String toString () {
		return brand + " " + price;
	}
	
	Car () {
		this.brand="";
		this.model="";
		this.price=0.f;
	}
	
	Car(String brand, String model, Float price) {
		this.brand=brand;
		this.model=model;
		this.price=price;
	}
	
	Car(String brand, String model, Double price) {
		this.brand=brand;
		this.model=model;
//		this.price=price;
	}
}