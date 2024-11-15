package com.in28minutes.learn_spring.example.a2;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class RealWorldBusinessCalculationServiceApplication{
	public static void main(String[] args) {
		
		try(var context = new AnnotationConfigApplicationContext(RealWorldBusinessCalculationServiceApplication.class)){
			
			System.out.println(context.getBean(BusinessCalculationService.class).findMax());
		}
	}
	
	
}