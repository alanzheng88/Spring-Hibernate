package com.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		try {
			Coach trackCoach = ctx.getBean("trackCoach", Coach.class);
			System.out.println(trackCoach.getDailyWorkout());
			System.out.println(trackCoach.getDailyFortune());
		} finally {
			ctx.close();
		}
	}

}
