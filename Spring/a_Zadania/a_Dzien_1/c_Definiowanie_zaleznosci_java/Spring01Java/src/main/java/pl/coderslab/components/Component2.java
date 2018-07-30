package pl.coderslab.components;
import org.springframework.context.annotation.Bean;

public class Component2 {

	@Bean
	public String helloWorld () {
		return "Hi!";
	}
}
