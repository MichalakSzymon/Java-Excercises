
public class ProductFactory {
	
	static Product createProduct (String productType) {
		switch(productType) {
			case ("simple"):
				return new SimpleProduct();
			case ("advance"):
				return new AdvanceProduct();
			case ("virtual"):
				return new VirtualProduct();
			default:
				throw new UnknownProductTypeException();
		}		
	}
}
