package com.kishan.idrf;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Car {
	
	private String beanId;
	
	public Car(String beanId)
	{
		this.beanId=beanId;
	}
	public void drive() {
		
		int status=0;
		IEngine engine=null;
		BeanFactory factory=new XmlBeanFactory(new ClassPathResource("com/kishan/idrf/spring-bean.xml"));
		engine =factory.getBean(beanId,IEngine.class);
		status=engine.startup();
		
		if(status==1)
		{
			System.out.println(beanId+"\t Engine Started");
			
		}
		else
		{
			System.out.println("Engine start faild");
		}
	}

}
