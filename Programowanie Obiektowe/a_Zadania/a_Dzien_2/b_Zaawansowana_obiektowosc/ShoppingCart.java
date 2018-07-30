package a_Zadania.a_Dzien_2.b_Zaawansowana_obiektowosc;

import java.util.Arrays;

public class ShoppingCart {
	Product [] products= {};
	
	public void addProduct(Product newProduct) {
		this.products=Arrays.copyOf(this.products, this.products.length+1);
		this.products[this.products.length-1]=newProduct;
	}
	
	public void removeProduct(int productId) {
		for(int i=0; i<products.length; i++) 
			if (products[i].getId()==productId) {
				
			}
	}
	
	public void changeProductQuantity(int productId, int newQuantity) {
		for(int i=0; i<products.length; i++) 
			if(products[i].getId()==productId) products[i].setQuantity(newQuantity ); 
	}
	
	public void printReceipt() {
		for(Product pro: products) {
			System.out.println(pro.getId() + ": " + pro.quantity + "x" + pro.getPrice() + " = " + pro.getTotalSum());
		}
	}
	
	
}
