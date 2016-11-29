package fr.alma.soa.boutique.application;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.alma.soa.boutique.application.boot.App;

public class ApplicationEntry {
	
	protected ClassPathXmlApplicationContext context;
	

	private App  app;
			
	public ApplicationEntry(){
		context = new ClassPathXmlApplicationContext(new String[] {"spring-core-config.xml"});
		app = (App) context.getBean(App.class);
	}
	
	public ClassPathXmlApplicationContext getContext(){
		return context;
	}
	
	public App getApp(){
		return app;
	}
}
