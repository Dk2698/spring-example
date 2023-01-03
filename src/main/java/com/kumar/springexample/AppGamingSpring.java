package com.kumar.springexample;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kumar.springexample.game.GameRunner;
import com.kumar.springexample.game.GamingConsole;
import com.kumar.springexample.game.MarioGame;
import com.kumar.springexample.game.PacmanGame;
import com.kumar.springexample.game.SuperContraGame;

public class AppGamingSpring {
	public static void main(String[] args) {
		

		
		try(var context =
				new AnnotationConfigApplicationContext(GamingConfiguration.class)){
			context.getBean(GamingConsole.class).up();
			
			context.getBean(GameRunner.class).run();


		}
		
	}
	

//	var game = new PacmanGame();//1: Object Creation and different game class
//
//	var gameRunner = new GameRunner(game); //2> Object Creation + wiring of Dependencies
//	// Game is Dependency of GameRunner
//	gameRunner.run();
}


