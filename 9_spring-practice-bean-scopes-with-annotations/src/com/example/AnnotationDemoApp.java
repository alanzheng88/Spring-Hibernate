package com.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		// read spring config file
		ClassPathXmlApplicationContext ctx =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		Coach tennisCoach = ctx.getBean("tennisCoach", Coach.class);
		
		// call method on the bean to get daily workout
		System.out.println(tennisCoach.getDailyWorkout());
		
		// call method to get daily fortune
		System.out.println(tennisCoach.getDailyFortune());
		
		// close the context
		ctx.close();
	}

}
