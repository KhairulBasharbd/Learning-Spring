package com.in28minutes.learn_spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age,Address address) {}
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
		
		return new Person("Selim",27,new Address("Rajb","BD"));
	}
	
	@Bean
	public Person person2MethodCall() {
		
		return new Person(name(),age(),address());
	}
	
	
	@Bean
	@Primary
	public Person person2Parameters(String name, int age, Address address) {
		
		return new Person(name,age,address);
	}
	
	
	// The default name of Bean is the name of the method, But we can change it.
	@Bean(name = "address1")
	@Primary
	public Address address() {
		return new Address("Raj","BD");
	}
	
	@Bean(name = "address2")
	public Address address2() {
		return new Address("NGN","BD");
	}
	

}
