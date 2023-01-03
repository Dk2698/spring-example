package com.kumar.springexample;

import com.kumar.springexample.game.GameRunner;
import com.kumar.springexample.game.MarioGame;
import com.kumar.springexample.game.SuperContraGame;

public class AppGamingBasic {
	public static void main(String[] args) {
		
		//var marioGame = new MarioGame();
		//this tightly couple why
		//create new game 
		var superContraGame = new SuperContraGame();
		var gameRunner = new GameRunner(superContraGame);
		gameRunner.run();
	}
}


