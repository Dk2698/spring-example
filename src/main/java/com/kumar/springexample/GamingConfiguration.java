package com.kumar.springexample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.kumar.springexample.game.GameRunner;
import com.kumar.springexample.game.GamingConsole;
import com.kumar.springexample.game.PacmanGame;

@Configuration
public class GamingConfiguration {
	
	@Bean
	public GamingConsole game() {
		var game = new PacmanGame();
		return game;
	}
	
	// wire to other dependency
//	@Bean
//	public GameRunner gameRunner(GamingConsole game) {
//		var gameRunner = new GameRunner(game); 
//		return gameRunner;
//	}
//	
	@Bean
	public GameRunner gameRunner() {
		var gameRunner = new GameRunner(game()); 
		return gameRunner;
	}
	
	
//var game = new MarioGame();

//	var game = new SuperContraGame();
	//var game = new PacmanGame();//1: Object Creation and different game class

	//var gameRunner = new GameRunner(game); //2> Object Creation + wiring of Dependencies
	// Game is Dependency of GameRunner
	//gameRunner.run();

}
