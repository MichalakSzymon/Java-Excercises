import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		final ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("conf.xml");
		context.getBean(SimpleCustomerLogger.class).log();		
			
		Customer customer = new Customer();
		MemoryCustomerRepository repo = context.getBean(MemoryCustomerRepository.class);
		repo.addCustomer(customer);;		
		
		context.getBean(FileCustomerLogger.class).log();
	}

}
