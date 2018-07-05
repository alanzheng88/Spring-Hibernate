package com.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		// load spring config file
		ClassPathXmlApplicationContext ctx =
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		// retrieve bean from spring container
		Coach coach1 = ctx.getBean("myCoach", Coach.class);
		Coach coach2 = ctx.getBean("myCoach", Coach.class);
		
		// check if they are the same bean
		boolean result = coach1 == coach2;
		
		// print out the result
		System.out.println("\nPointing to the same object: " + result);
		System.out.println("\nMemory location for coach1: " + coach1);
		System.out.println("\nMemory location for coach2: " + coach2);
		
		ctx.close();
	}
}
