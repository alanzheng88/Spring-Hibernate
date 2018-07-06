package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// need to manually uncomment ComponentScan in SportConfig.java to run
public class JavaConfigDemoApp {

	public static void main(String[] args) {
		// read spring config file
		AnnotationConfigApplicationContext ctx =
				new AnnotationConfigApplicationContext(SportConfig.class);
		
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
