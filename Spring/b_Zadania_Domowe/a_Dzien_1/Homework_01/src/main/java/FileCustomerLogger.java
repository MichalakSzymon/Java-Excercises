import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class FileCustomerLogger {

	String filename;	
	
	public void setFilename(String fileName) {
		this.filename=fileName;
	}
	
	public void log() {
		try {
			FileWriter out = new FileWriter ("log.txt");
			LocalDateTime ldt = LocalDateTime.now();
			out.append(ldt + ": customer operation");
			out.close();
		} catch (IOException e) {
			System.out.println("No file found");
		}
		
	}

}
