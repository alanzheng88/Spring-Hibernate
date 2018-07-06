package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx =
				new AnnotationConfigApplicationContext(MainConfig.class);
		Coach coach = ctx.getBean("badmintonCoach", Coach.class);
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
		String email = ((BadmintonCoach) coach).getEmail();
		int years = ((BadmintonCoach) coach).getYearsOfExperience();
		System.out.println("email: " + email);
		System.out.println("years: " + years);
		ctx.close();
	}

}
