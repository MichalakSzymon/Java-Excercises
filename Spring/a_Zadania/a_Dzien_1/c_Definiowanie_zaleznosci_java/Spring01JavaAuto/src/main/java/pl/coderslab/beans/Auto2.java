package pl.coderslab.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Auto2 {
	
	private final Auto1 auto1;
	
	@Autowired
	public Auto2(Auto1 auto1) {
		this.auto1 = auto1;
	}

	@Override
	public String toString() {
		return "Auto2{ "
				+ "auto1= " + auto1 +
				'}';
	}
}
