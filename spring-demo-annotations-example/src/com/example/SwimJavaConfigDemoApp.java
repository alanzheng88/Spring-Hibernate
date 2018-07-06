package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		// read spring config file
		AnnotationConfigApplicationContext ctx =
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		// retrieve bean from spring container
		Coach coach = ctx.getBean("swimCoach", Coach.class);
		
		// get description
		String description = ((SwimCoach) coach).getDescription();
		
		// call method on the bean to get daily workout
		System.out.println(description + " " + coach.getDailyWorkout());
		
		// call method to get daily fortune
		System.out.println(description + " " + coach.getDailyFortune());
		
		// close the context
		ctx.close();
	}

}
