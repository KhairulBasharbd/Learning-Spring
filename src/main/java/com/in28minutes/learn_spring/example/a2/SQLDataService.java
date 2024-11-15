package com.in28minutes.learn_spring.example.a2;

import org.springframework.stereotype.Component;

@Component
public class SQLDataService implements DataService{
	
	public int [] retrieveData() {
		return new int [] {1,2,3,4,5};
	}
}
