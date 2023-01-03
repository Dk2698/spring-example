package com.kumar.springexample;

import com.kumar.springexample.game.GameRunner;
import com.kumar.springexample.game.MarioGame;
import com.kumar.springexample.game.PacmanGame;
import com.kumar.springexample.game.SuperContraGame;

public class AppGamingBasic {
	public static void main(String[] args) {
		
		//var marioGame = new MarioGame();
		//this tightly couple why
		//create new game 
		//var superContraGame = new SuperContraGame();
		// interface = implement interface of object
//		var game = new MarioGame();

//		var game = new SuperContraGame();
		var game = new PacmanGame();//1: Object Creation and different game class

		var gameRunner = new GameRunner(game); //2> Object Creation + wiring of Dependencies
		// Game is Dependency of GameRunner
		gameRunner.run();
	}
	
	// why is coupling important 
	// coupling : How much work is involved in changing something?
	// An engine is tightly coupled to a car
	// A wheel is loosely coupled to a car
	// loose coupling
	//we want to make functional changes wit as less code changes as possible
	
	///creation object completely manage to jvm and wire us manually with code
	// spring -> create object for us and wire them together
}


