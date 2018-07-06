package com.example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:coach.properties")
public class MainConfig {

	@Value("${coach.alan.email}")
	String email;
	
	@Value("${coach.alan.yearsOfExperience}")
	int yearsOfExp;
	
	@Bean
	FortuneService airplaneFortuneService() {
		return new AirplaneFortuneService();
	}
	
	@Bean
	FortuneService randomFortuneService() {
		return new RandomFortuneService();
	}
	
	@Bean
	Coach badmintonCoach(
			@Qualifier("airplaneFortuneService")
			FortuneService fs) {
		BadmintonCoach badmintonCoach = new BadmintonCoach(fs);
		badmintonCoach.setEmail(email);
		badmintonCoach.setYearsOfExperience(yearsOfExp);
		return badmintonCoach;
	}
}
