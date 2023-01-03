package com.kumar.springexample.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

//Eliminate verbosity in creating java Beans
// public accessory method, constructor, equals, hasCode and toString are automatically created

record Person (String name , int age, Address address) {};

// Address - firstLine & city
record Address(String firstLine, String city) {};

@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	public String name() {
		return "Kumar";
	}
	
	@Bean
	public int age() {
		return 25;
	}
	
	@Bean
	public Person person() {
		var person = new Person("Ravi", 20, new Address("Main Street","Utrecht"));
		return person;
	}
	
	@Bean(name="address2")
	public Address address() {
		return new Address("baker street", "London");
	}
	
	@Bean
	public Person person2MethodCall() {
		var person = new Person(name(),age(), address());
		return person;
	}

	@Bean
	@Primary
	public Person person3Parameters(String name, int age, Address address3) {// name, age, address2
		return  new Person(name, age ,address3);
		
	}
	

	@Bean(name="address3")
	@Primary
	@Qualifier("adress3aulifier")
	public Address address3() {
		return new Address("new Ashok nagar", "Delhi");
	}
	
//	No qualifying bean of type 'com.kumar.springexample.Address' available: expected single matching bean but found 2: address2,address3
	@Bean
	public Person person4Parameters(String name, int age, Address address) {// name, age, address2
		return  new Person(name, age ,address);
		
	}
	
	@Bean
	@Primary
	public Person person5Qualifier(String name, int age, @Qualifier("adress3aulifier") Address address3) {// name, age, address2
		return  new Person(name, age ,address3);
		
	}
}
