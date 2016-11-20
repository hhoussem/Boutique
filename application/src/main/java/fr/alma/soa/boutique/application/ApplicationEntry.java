package fr.alma.soa.boutique.application;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationEntry {
	private ClassPathXmlApplicationContext context;
	

	public ApplicationEntry(){
		context = new ClassPathXmlApplicationContext(new String[] {"spring-core-config.xml"});
	}
}
