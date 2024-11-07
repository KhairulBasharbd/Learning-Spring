package com.in28minutes.learn_spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloworldSpring {

	public static void main(String[] args) {
		//1. launch spring context
		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		
		//2. configuration class spring to manage all things
		
		System.out.println(context.getBean("name"));
		
		System.out.println(context.getBean("age"));
		System.out.println(context.getBean("person"));
		System.out.println(context.getBean("address"));
		
	}

}
