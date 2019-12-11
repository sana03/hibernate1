package com.sananda.hibernatemapping.Util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.springframework.context.annotation.PropertySource;

import com.sananda.hibernatemapping.Entity.EmpDetails;


public class HibrnateUtil {

	
	private static final SessionFactory sessionFactory = buildSessionFactory();
	
	private static SessionFactory buildSessionFactory() {

		try {
			Configuration config =new Configuration();
			//apply configuration property settings to StandardServiceRegistryBuilder
	    	//ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
			return config.configure().buildSessionFactory();
	        /*Configuration configuration = new Configuration();
	        ServiceRegistry serviceRegistry
	            = new StandardServiceRegistryBuilder()
	                .applySettings(configuration.getProperties()).build();
	        configuration.addAnnotatedClass(EmpDetails.class);
	        return configuration
	                .buildSessionFactory(serviceRegistry);*/
		}
		catch(Throwable t) {
			System.out.println("Exception is: san001: "+t);
			t.printStackTrace();
			throw new ExceptionInInitializerError();
		}
	}

	public static SessionFactory getSessionfactory() {
		return sessionFactory;
	}
	
	
	}
	

