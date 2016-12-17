package com.tutorialspoint;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//public class MainApp1 {
//	public static void main(String[] args) {
//		XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("SpringBeans.xml"));
//		HelloWorld obj = (HelloWorld) factory.getBean("helloWorld");
//		obj.getMessage();
//	}
//}

public class CopyOfMainApp {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		// obj.getMessage();
		context.registerShutdownHook();
	}
}