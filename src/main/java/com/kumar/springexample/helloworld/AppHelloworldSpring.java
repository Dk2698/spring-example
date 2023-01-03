package com.kumar.springexample.helloworld;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kumar.springexample.game.GameRunner;
import com.kumar.springexample.game.MarioGame;
import com.kumar.springexample.game.PacmanGame;
import com.kumar.springexample.game.SuperContraGame;

public class AppHelloworldSpring {
	public static void main(String[] args) {
		//1) launch a Spring Context
		try(var context = 
				new AnnotationConfigApplicationContext(HelloWorldConfiguration.class))
		{
			
			//2) Configure the things that we want spring to manage - @Configuration 
			
			// name  method- @Bean
			
			// 3) Retrieving Beans managed by spring
			System.out.println(context.getBean("name"));
			System.out.println(context.getBean("age"));
			
			System.out.println(context.getBean("person"));
			
//			System.out.println(context.getBean("address"));
			System.out.println(context.getBean("address2"));
			//  No qualifying bean of type 'com.kumar.springexample.Address' available: expected single matching bean but found 2: address2,address3
//			System.out.println(context.getBean(Address.class));
			System.out.println(context.getBean("person2MethodCall"));
			System.out.println(context.getBean("person3Parameters"));

			Arrays.stream(context.getBeanDefinitionNames())
				.forEach(System.out::println);
			
			// looking to matching type
//			System.out.println(context.getBean(Person.class));
			System.out.println(context.getBean(Address.class));

		}
	
		
	}
}


