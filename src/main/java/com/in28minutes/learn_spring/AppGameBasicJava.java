package com.in28minutes.learn_spring;

import com.in28minutes.learn_spring.game.GameRunner;
import com.in28minutes.learn_spring.game.MarioGame;
import com.in28minutes.learn_spring.game.PacManGame;
import com.in28minutes.learn_spring.game.SuperContraGame;

public class AppGameBasicJava {

	public static void main(String[] args) {

		var game = new MarioGame();
		//var game = new SuperContraGame();
		//var game = new PacManGame();
		
		
		var gameRunner = new GameRunner(game);
		gameRunner.run();
		
		
	}

}
