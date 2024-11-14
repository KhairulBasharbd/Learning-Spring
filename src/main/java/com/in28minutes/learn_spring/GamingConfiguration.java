package com.in28minutes.learn_spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.in28minutes.learn_spring.game.GameRunner;
import com.in28minutes.learn_spring.game.GamingConsole;
import com.in28minutes.learn_spring.game.PacManGame;


@Configuration
public class GamingConfiguration {
	
	@Bean
	public GamingConsole game() {
		
		return new PacManGame();
	}
	
	@Bean
	public GameRunner gamerunner(GamingConsole game) {
		
		return new GameRunner(game);
	}

}
