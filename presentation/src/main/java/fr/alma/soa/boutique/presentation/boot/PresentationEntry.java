package fr.alma.soa.boutique.presentation.boot;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.alma.soa.boutique.application.boot.App;

public class PresentationEntry {
	
	protected ClassPathXmlApplicationContext context;
	

	private App  app;
			
	public PresentationEntry(){
		context = new ClassPathXmlApplicationContext(new String[] {"spring-core-config-p.xml"});
		app = (App) context.getBean(App.class);
	}
	
	public ClassPathXmlApplicationContext getContext(){
		return context;
	}
	
	public App getApp(){
		return app;
	}
}
