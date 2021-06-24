package com.kishan.setterinjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.kishan.primitiveInjection.Employe;

public class SetterMain{

	public static void main(String[] args) {
		
		BeanFactory factory =new XmlBeanFactory(new ClassPathResource("com/kishan/bean/spring-bean.xml"));
		
		Radio radio =(Radio)factory.getBean("radio",Radio.class);
		
		   radio.listen();
		
		
	}
}
