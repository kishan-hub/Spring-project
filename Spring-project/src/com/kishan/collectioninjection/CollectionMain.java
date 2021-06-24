package com.kishan.collectioninjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionMain {
	
	public static void main(String []args)
	{
		 ApplicationContext context =new ClassPathXmlApplicationContext("com/kishan/collectioninjection/spring-bean.xml");
		 
		 //Get the Colllege object
		 College college=context.getBean("college",College.class);
		 
		 System.out.println(college);
		 
	}

}
