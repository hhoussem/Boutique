package fr.alma.soa.boutique.application;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationEntry {
	
	private final Logger logger = LoggerFactory.getLogger(ApplicationEntry.class);

	protected ClassPathXmlApplicationContext context;
	

	public ApplicationEntry(){
		context = new ClassPathXmlApplicationContext(new String[] {"spring-core-config.xml"});
	}
	
	public ClassPathXmlApplicationContext getContext(){
		return context;
	}
}
