package pl.coderslab.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import pl.coderslab.bean.EmailService;
import pl.coderslab.bean.HelloWorld;
import pl.coderslab.bean.MessageSender;

public class SpringDiApplication {

	public static void main(String[] args) {
		
		final ClassPathXmlApplicationContext context	=	new	ClassPathXmlApplicationContext("conf.xml");
		System.out.println(((HelloWorld) context.getBean("helloWorld")).getMessage());
		
		context.getBean(EmailService.class).send("message");		
		context.getBean(MessageSender.class).sendMessage("message");
		
		context.close();
	}

}
