package com.mkyong.core;

/**
 * Spring bean
 * 
 */
public class HelloWorld {
	private String name;
	private String message;

	public void setName(String name) {
		this.name = name;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void printHello() {
		System.out.println("Spring 3 : Hello ! " + name);
	}

	public void getMessage() {
		System.out.println("Spring 3 : Hello ! " + message);
	}
}