package pl.coderslab.scope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

public class AppConfig {
	
	
	@Bean
	public Scope1 component1 () {
	return new Scope1();
	}
	
	@Bean
	@Scope("prototype")
	public Scope2 component2 () {
	return new Scope2();
	}
	
}
