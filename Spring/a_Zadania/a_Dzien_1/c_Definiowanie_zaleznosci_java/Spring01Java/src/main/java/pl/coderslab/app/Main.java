package pl.coderslab.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import pl.coderslab.bin.HelloWorld;
import pl.coderslab.conf.AppConfig;

public class Main {

	public static void main(String[] args) {
		
		final AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		final HelloWorld bean = ctx.getBean(HelloWorld.class);
		System.out.println(bean.getHelloMessage());
		ctx.close();
		
	}
}
