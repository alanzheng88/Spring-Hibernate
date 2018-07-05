package com.example;



import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class TennisCoach implements Coach, InitializingBean {

	// field injection
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	@Value("${alan.email}")
	private String email;
	
	@Value("${alan.team}")
	private String team;
	
	public TennisCoach() {
		System.out.println(">> inside default constructor");
	}
	
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println(">> inside doMyStartupStuff");
	}
	
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println(">> inside doMyCleanupStuff");
	}
	
	/*
	// constructor injection
	@Autowired
	public TennisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	*/
	
	/*
	// setter injection
	@Autowired
	public void doSomeCrazyStuff(FortuneService fortuneService) {
		System.out.println(">> TennisCoach: inside doSomeCrazyStuff() method");
		this.fortuneService = fortuneService;
	}
	*/
	
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	private void getInfo() {
		System.out.println("email: " + email + " | " +
							"team: " + team);
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		getInfo();
	}

}
