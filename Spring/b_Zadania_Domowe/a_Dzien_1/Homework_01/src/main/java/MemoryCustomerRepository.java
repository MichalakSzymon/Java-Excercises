import java.util.ArrayList;
import java.util.List;

public class MemoryCustomerRepository implements CustomerRepository {
	private	CustomerLogger customerLogger = new SimpleCustomerLogger();
	List <Customer> lista = new ArrayList <> ();

	
	public MemoryCustomerRepository (CustomerLogger customerLogger) {
		this.customerLogger = customerLogger;
	}
	
	public void addCustomer(Customer customer) {
		customerLogger.log();
		lista.add(customer);
	}

	public void deleteCustomer(Customer customer) {
		customerLogger.log();
		lista.remove(customer);
	}

	public void printCustomer() {
		customerLogger.log();
		for(Customer customer: lista)
			System.out.println(customer);
	}
}