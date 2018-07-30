import java.time.LocalDateTime;



public class SimpleCustomerLogger implements CustomerLogger{

	LocalDateTime ldt = LocalDateTime.now();
	public void log() {
		System.out.println(ldt + ": customer operation");
	}
	
}
