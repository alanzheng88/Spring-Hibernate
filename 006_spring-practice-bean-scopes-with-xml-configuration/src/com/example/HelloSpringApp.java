package com.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// read the spring config file & create spring container
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		// reference bean using spring container
		Coach coach1 = ctx.getBean("cricketCoach", Coach.class);
		Coach coach2 = ctx.getBean("cricketCoach", Coach.class);
		System.out.println("coach1 == coach2 : " + (coach1 == coach2));
		ctx.close();
	}

}
