package com.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		try {
			Coach coach = ctx.getBean("coach", Coach.class);
			System.out.println(coach.getDailyWorkout());
		} finally {
			ctx.close();
		}
	}
	
}
