package com.in28minutes.learn_spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.in28minutes.learn_spring.game.GameRunner;
import com.in28minutes.learn_spring.game.GamingConsole;



@Configuration
@ComponentScan("com.in28minutes.learn_spring.game")

public class App03GamingSpringBeans {

	public static void main(String[] args) {
		try(var context = new AnnotationConfigApplicationContext(App03GamingSpringBeans.class)){
			
			context.getBean(GamingConsole.class).up();
			
			//context.getBean("game") returns an Object type by default, and the Object class does not have an up() method. 
			//To call the up() method directly, you need to cast the bean to the GameRunner type
			//((GameRunner)context.getBean("gamerunner")).run();
			
			context.getBean(GameRunner.class).run();
			
		}
		
		
		
	}

}
