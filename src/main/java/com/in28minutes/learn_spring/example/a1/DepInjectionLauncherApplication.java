package com.in28minutes.learn_spring.example.a1;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class YourBusinessClass{
	
	//   @Autowired tells Spring to find a bean of the required type and 
	//    inject it where the annotation is placed.
	
//----------------------Field based Injection--------------------------	
//	@Autowired
//	Dependency1 dependency1;
//	@Autowired
//	Dependency2 dependency2;
//----------------------Field based Injection--------------------------	

////----------------------Setter based Injection--------------------------	
//	Dependency1 dependency1;
//	Dependency2 dependency2;
//	
//	@Autowired
//	public void setDependency1(Dependency1 dependency1) {
//		this.dependency1 = dependency1;
//	}
//	@Autowired
//	public void setDependency2(Dependency2 dependency2) {
//		this.dependency2 = dependency2;
//	}
////----------------------Setter based Injection--------------------------	

	//----------------------Constructor based Injection--------------------------	
		Dependency1 dependency1;
		Dependency2 dependency2;
		
		@Autowired
		public void YourBusinessClass(Dependency1 dependency1, Dependency2 dependency2) {
			System.out.println("Constructor Insjection -- Business class");
			this.dependency1 = dependency1;
			this.dependency2 = dependency2;
		}
	//----------------------Constructor based Injection--------------------------	

	public String xyz() {
		return "Using " + dependency1 +" and " + dependency2;
	}
}

@Component
class Dependency1{
	
}

@Component

class Dependency2{
	
}

@Configuration
@ComponentScan
public class DepInjectionLauncherApplication {

	public static void main(String[] args) {
		try(var context = new AnnotationConfigApplicationContext(DepInjectionLauncherApplication.class)){
			
//			Arrays.stream(context.getBeanDefinitionNames())
//			.forEach(System.out::println);

			System.out.println(context.getBean(YourBusinessClass.class).xyz());
		}
		
	}

}
