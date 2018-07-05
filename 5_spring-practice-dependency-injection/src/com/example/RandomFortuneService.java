package com.example;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

	private String[] fortunes = {
		"Today is your silly day!",
		"Today is your fun day!",
		"Today is your chill day!"
	};
	
	@Override
	public String getFortune() {
		Random randNumGenerator = new Random();
		int randNum = randNumGenerator.nextInt(fortunes.length);
		return fortunes[randNum];
	}

}
