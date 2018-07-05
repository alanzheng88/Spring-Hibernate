package com.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		// load spring config file
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		Coach coach1 = ctx.getBean("tennisCoach", Coach.class);
		Coach coach2 = ctx.getBean("tennisCoach", Coach.class);
		
		// check if they are the same
		boolean result = (coach1 == coach2);
		
		// print out the results
		System.out.println("\nPointing to the same object: " + result);
		System.out.println("\nMemory location for coach1: " + coach1);
		System.out.println("\nMemory location for coach2: " + coach2);
		
		ctx.close();
	}

}
