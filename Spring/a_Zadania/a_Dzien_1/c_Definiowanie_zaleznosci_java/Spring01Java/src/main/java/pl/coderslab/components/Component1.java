package pl.coderslab.components;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Component1 {
	
	private final Component2 component2;
	
	public Component1(Component2 component2) {
		this.component2 = component2;
	}
	

}
