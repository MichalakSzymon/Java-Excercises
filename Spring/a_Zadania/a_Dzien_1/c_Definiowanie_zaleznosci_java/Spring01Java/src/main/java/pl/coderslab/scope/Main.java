package pl.coderslab.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
			
		Scope1 scope1 = context.getBean(Scope1.class);
		System.out.println(scope1);
		Scope1 scope11 = context.getBean(Scope1.class);
		System.out.println(scope11);
		Scope2 scope2 = context.getBean(Scope2.class);
		System.out.println(scope2);
		Scope2 scope22 = context.getBean(Scope2.class);
		System.out.println(scope22);
	}

}
