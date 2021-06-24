package com.kishan.beaninheritence;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class BITest {
	
	public static void main(String[] args) {
		
		BeanFactory factory =new XmlBeanFactory(new ClassPathResource("com/kishan/beaninheritence/Spring-bean.xml"));
		
	    Car car =factory.getBean("car",Car.class);
	    
	    Car car1=factory.getBean("car1",Car.class);
	    
	    Car car2 =factory.getBean("car2",Car.class);
	    
	    System.out.println(car);
	    System.out.println(car1);
	    System.out.println(car2);
	}
    
      
   
    

}
