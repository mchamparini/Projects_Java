package com.film.producer.config;

import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class AppInitializer implements WebApplicationInitializer{
	
	@Override
	public void onStartup(javax.servlet.ServletContext servletContext){
		final AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();
		rootContext.register(AppConfigAdapter.class);
		rootContext.setServletContext(servletContext);
		
		
		final ServletRegistration.Dynamic servlet = 
			  servletContext.addServlet("dispatcher", new DispatcherServlet(rootContext));
		servlet.setLoadOnStartup(1);
		servlet.addMapping("/");
		servletContext.addListener(new ContextLoaderListener(rootContext));
	}
}
