package com.kishan.primitiveInjection;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class PrimitiveMain {
	
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/kishan/bean/spring-bean.xml");
		
		Employe employe =(Employe)context.getBean("employe",Employe.class);
		
		System.out.println(employe);
	}

}
