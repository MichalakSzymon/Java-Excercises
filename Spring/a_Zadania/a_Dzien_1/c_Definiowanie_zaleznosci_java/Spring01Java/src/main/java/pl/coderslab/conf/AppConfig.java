package pl.coderslab.conf;

import org.springframework.context.annotation.Bean;

import pl.coderslab.bin.HelloWorld;

public class AppConfig {

	@Bean
	public HelloWorld helloWorld () {
		final HelloWorld helloWorld = new HelloWorld();
		helloWorld.setHelloMessage("Hello From Spring");
		return helloWorld;
	}
}
