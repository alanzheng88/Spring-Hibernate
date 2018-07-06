package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

	private FortuneService fortuneService;
	private String email;
	private String team;
	
	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Autowired
	public void setEmail(@Value("${alan.email}") String email) {
		this.email = email;
	}
	
	@Autowired
	public void setTeam(@Value("${alan.team}") String team) {
		this.team = team;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Swim 1000 meters as a warmup.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	public String getDescription() {
		return "[" + email + " " + team + "]";
	}

}
