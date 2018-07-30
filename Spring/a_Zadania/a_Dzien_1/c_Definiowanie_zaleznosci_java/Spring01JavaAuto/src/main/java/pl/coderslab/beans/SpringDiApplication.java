package pl.coderslab.beans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDiApplication {

	public static void main(String[] args) {

		final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Auto2 auto2 = context.getBean(Auto2.class);
		System.out.println(auto2);
	
		context.close();
	}

	
}
