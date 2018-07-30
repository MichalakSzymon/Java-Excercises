package a_Zadania.a_Dzien_2.b_Zaawansowana_obiektowosc;


public class Product {
	private final int id;
	private static int nextId=0;
	String name;
	String description;
	private double price;
	int quantity;
	
	public void setPrice(double price) {
		if(price>0.01) this.price = price;
	} 
	
	public void setQuantity(int quantity) {
		if(quantity>0) this.quantity = quantity;
	}
	
	Product(String description, double price, int quantity) {
		this.description=description;
		this.setPrice(price);
		this.quantity = quantity;
		this.id = nextId; 
		Product.nextId++;
	}
	
	public double getTotalSum() {
		double rabat=1.0;
		if(quantity>=3) rabat=1.2;
		return rabat*quantity*getPrice();
	}

	public int getId() {
		return id;
	}

	public double getPrice() {
		return price;
	}

}

	