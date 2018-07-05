package com.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		try {
			Coach coach = ctx.getBean("myCricketCoach", Coach.class);
			System.out.println(coach.getDailyWorkout());
			System.out.println(coach.getDailyFortune());
			System.out.println("Team: " + ((CricketCoach) coach).getTeam());
			System.out.println("Email: " + ((CricketCoach) coach).getEmailAddress());
		} finally {
			ctx.close();
		}
	}
}
