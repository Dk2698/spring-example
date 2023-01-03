package com.kumar.springexample;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kumar.springexample.game.GameRunner;
import com.kumar.springexample.game.MarioGame;
import com.kumar.springexample.game.PacmanGame;
import com.kumar.springexample.game.SuperContraGame;

public class AppHelloworldSpring {
	public static void main(String[] args) {
		//1) launch a Spring Context
		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		//2) Configure the things that we want spring to manage - @Configuration 
		
		// name  method- @Bean
		
		// 3) Retrieving Beans managed by spring
		System.out.println(context.getBean("name"));
		System.out.println(context.getBean("age"));
		
		System.out.println(context.getBean("person"));
		
		System.out.println(context.getBean("address"));



		
	}
}


