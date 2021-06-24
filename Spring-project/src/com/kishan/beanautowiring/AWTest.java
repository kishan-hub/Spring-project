package com.kishan.beanautowiring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class AWTest {
	public static void main(String[] args) {
		
		 ApplicationContext context =new ClassPathXmlApplicationContext("com/kishan/beanautowiring/spring-bean.xml");
		Robot robot=context.getBean("robot",Robot.class);
		
		System.out.println(robot);
	}
   
}
