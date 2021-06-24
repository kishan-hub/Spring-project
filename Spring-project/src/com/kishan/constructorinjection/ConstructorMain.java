package com.kishan.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorMain {
 
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/kishan/bean/spring-bean.xml");
		
		University university =(University)context.getBean("university",University.class);
		
		System.out.println(university);
		
	}
}
