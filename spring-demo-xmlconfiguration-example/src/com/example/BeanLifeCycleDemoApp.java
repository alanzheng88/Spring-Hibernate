package com.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		
		// load spring config file
		ClassPathXmlApplicationContext ctx =
				new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		
		// retrieve bean from spring container
		Coach coach = ctx.getBean("myCoach", Coach.class);
		System.out.println(coach.getDailyWorkout());
		
		// close the context
		ctx.close();
	}
}
