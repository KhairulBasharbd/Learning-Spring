package com.in28minutes.learn_spring.example.a2;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MongodbDataService implements DataService{
	
	public int [] retrieveData() {
		return new int [] {10,20,30,40,50};
	}
}