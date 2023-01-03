package com.kumar.springexample.helloworld;

import java.io.Serializable;

// plain old java object
// any java object is pojo
class Pojo{
	private String text;
	private int number;
	
	public String toString() {
		return text+":"+ number;
	}
}

// more strict
// EJB enterprise java bean
// no argument constructor
class JavaBean implements Serializable {
	//1 public no-arg constructor
	public JavaBean() {
		
	}
	private String text;
	private int number;
	
	public String toString() {
		return text+":"+ number;
	}
	//1 setters and getters

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
}

public class SpringBeanVsJavaBean {
	public static void main(String[] args) {
	Pojo pojo = new Pojo();
	System.out.println(pojo);
	}
}
