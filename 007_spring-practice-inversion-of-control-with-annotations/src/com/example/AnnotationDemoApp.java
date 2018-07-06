package com.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		// read spring config file
		ClassPathXmlApplicationContext ctx =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		Coach tennisCoach = ctx.getBean("tennisCoach", Coach.class);
		Coach surfingCoach = ctx.getBean("surfingCoach", Coach.class);
		
		// call method on the bean
		System.out.println(tennisCoach.getDailyWorkout());
		System.out.println(surfingCoach.getDailyWorkout());
		
		// close the context
		ctx.close();
	}

}
