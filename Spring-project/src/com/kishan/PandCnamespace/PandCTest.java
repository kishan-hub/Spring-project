package com.kishan.PandCnamespace;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class PandCTest {

	public static void main(String[] args) {
		
		BeanFactory factory =new XmlBeanFactory(new ClassPathResource("com/kishan/PandCnamespace/spring-bean.xml"));
		
		Person person=factory.getBean("person",Person.class);
		
		
		System.out.println(person.toString());
		
	}
}
