package com.kumar.springexample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//Eliminate verbosity in creating java Beans
// public accessory method, constructor, equals, hasCode and toString are automatically created

record Person (String name , int age) {};

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
		var person = new Person("Ravi", 20);
		return person;
	}
	
	@Bean
	public Address address() {
		return new Address("baker street", "London");
	}

}
