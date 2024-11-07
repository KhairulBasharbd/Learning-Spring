package com.in28minutes.learn_spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age) {}
record Address(String city, String country ) {}

@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	public String name(){
		return "Khairul Basar";
	}
	@Bean
	public int age() {
		return 25;
	}
	
	@Bean
	public Person person() {
		
		return new Person("Selim",27);
	}
	@Bean
	public Address address() {
		return new Address("Raj","BD");
	}
	

}
