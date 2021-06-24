package com.kishan.idrf;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class IdrfEngineMain {
	
	public static void main(String[] args) {
		
	  BeanFactory factory =new XmlBeanFactory(new ClassPathResource("com/kishan/idrf/spring-bean.xml"));
	  
	  Car car =factory.getBean("car",Car.class);
	   car.drive();
	
	}

}
