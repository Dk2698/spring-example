package com.kumar.springexample.game;

public class GameRunner {
	// tightly couple MarioGame because it's some change here 
//	private MarioGame game;
	private SuperContraGame game;
	
	// create constructor to passing object of MarioGame class
	public  GameRunner(SuperContraGame game) {
		this.game = game;
	}


	public void run() {
		System.out.println("Running game: "+ game);
		
		// here run mariogGame  method and first passing object of this class
		game.up();
		game.down();
		game.left();
		game.right();
	}
}
