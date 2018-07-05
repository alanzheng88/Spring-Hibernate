package com.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class FileFortuneService implements FortuneService {

	private List<String> fortunes = new ArrayList<String>();
	
	public FileFortuneService() {
		String projectDir = System.getProperty("user.dir");
		String filePath = Paths.get(projectDir, 
							"src",
							"fortune-properties.txt").toString();
		System.out.println(filePath);
		BufferedReader in;
		try {
			in = new BufferedReader(new FileReader(filePath));
			while (in.ready()) {
				fortunes.add(in.readLine());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public String getFortune() {
		Random numGenerator = new Random();
		int randNum = numGenerator.nextInt(fortunes.size());
		return fortunes.get(randNum);
	}

}
