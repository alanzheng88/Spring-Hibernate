package com.example;

public class BadmintonCoach implements Coach {

	private FortuneService fortuneService;
	private String email;
	private int yearsOfExperience;
	
	public BadmintonCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	void setEmail(String email) {
		this.email = email;
	}
	
	void setYearsOfExperience(int yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}
	
	public String getEmail() {
		return email;
	}
	
	public int getYearsOfExperience() {
		return yearsOfExperience;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Do 100 lunges! Work those legs";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
