package com.in28minutes.learn_spring.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;



@Configuration
@ComponentScan("com.in28minutes.learn_spring.game")

public class GamingAppLauncherApplication {

	public static void main(String[] args) {
		try(var context = new AnnotationConfigApplicationContext(GamingAppLauncherApplication.class)){
			
			context.getBean(GamingConsole.class).down();
			
			//context.getBean("game") returns an Object type by default, and the Object class does not have an up() method. 
			//To call the up() method directly, you need to cast the bean to the GameRunner type
			//((GameRunner)context.getBean("gameRunner")).run();
			
			context.getBean(GameRunner.class).run();
			
		}
		
	}

}
