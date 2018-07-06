package com.example;

import org.springframework.stereotype.Component;

@Component
public class SurfingCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Swim 100m out and back";
	}

}
