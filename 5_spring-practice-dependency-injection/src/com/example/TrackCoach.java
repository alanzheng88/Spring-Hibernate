package com.example;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	private String firstName;
	private String lastName;
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	private String getFullName() {
		return firstName + " " + lastName;
	}
	
	@Override
	public String getDailyWorkout() {
		return getFullName() + ": Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return getFullName() + ": Just Do It! " + fortuneService.getFortune();
	}

}
