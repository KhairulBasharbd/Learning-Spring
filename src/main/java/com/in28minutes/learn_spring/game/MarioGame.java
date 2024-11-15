package com.in28minutes.learn_spring.game;

import org.springframework.stereotype.Component;

@Component
public class MarioGame implements GamingConsole{

	public void up() {
		System.out.println("Jump..");
	}
	public void down() {
		System.out.println("enter into hole..");
	}
	public void left() {
		System.out.println("go back..");
	}
	public void right() {
		System.out.println("accelarate..");
	}
}
