package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.example")
@PropertySource("classpath:sport.properties")
public class SportConfig {

	@Bean
	FortuneService fortuneService() {
		return new SadFortuneService();
	}
	
	@Bean
	Coach swimCoach() {
		return new SwimCoach(fortuneService());
	}
	
}
