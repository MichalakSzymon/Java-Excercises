package pl.coderslab.components;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		final AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		final Component1 component = ctx.getBean(Component1.class);
	
	}
}