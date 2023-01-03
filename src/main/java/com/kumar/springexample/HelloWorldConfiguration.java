package com.kumar.springexample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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
	public Person person3Parameters(String name, int age, Address address3) {// name, age, address2
		return  new Person(name, age ,address3);
		
	}
	

	@Bean(name="address3")
	public Address address3() {
		return new Address("new Ashok nagar", "Delhi");
	}
}
