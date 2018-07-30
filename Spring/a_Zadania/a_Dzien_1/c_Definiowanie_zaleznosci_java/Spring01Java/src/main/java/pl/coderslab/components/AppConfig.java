package pl.coderslab.components;

import org.springframework.context.annotation.Bean;

public class AppConfig {
	
	
	private Component2 component2() {
		return new Component2();
	}
	
	@Bean
	public Component1 component1 () {
		return new Component1(component2());
	}
}
