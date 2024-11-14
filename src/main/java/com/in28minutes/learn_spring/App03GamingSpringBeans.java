package com.in28minutes.learn_spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.in28minutes.learn_spring.game.GameRunner;
import com.in28minutes.learn_spring.game.GamingConsole;
import com.in28minutes.learn_spring.game.MarioGame;
import com.in28minutes.learn_spring.game.PacManGame;
import com.in28minutes.learn_spring.game.SuperContraGame;

public class App03GamingSpringBeans {

	public static void main(String[] args) {
		try(var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)){
			
			context.getBean(GamingConsole.class).up();
			
			//context.getBean("game") returns an Object type by default, and the Object class does not have an up() method. 
			//To call the up() method directly, you need to cast the bean to the GameRunner type
			((GameRunner)context.getBean("gamerunner")).run();
			
		}
		
		

		//var game = new MarioGame();
		//var game = new SuperContraGame();
//		var game = new PacManGame();
//		
//		
//		var gameRunner = new GameRunner(game);
//		gameRunner.run();
		
		
	}

}
