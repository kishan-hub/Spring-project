package com.kishan.collectionmerging;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Test {
	
	public static void main(String[]args)
	{
	   	BeanFactory factory =new XmlBeanFactory(new ClassPathResource("com/kishan/collectionmerging/spring-bean.xml"));
	   	Course course = factory.getBean("btech",Course.class);
	   	
	   	System.out.println(course);
	}

}
