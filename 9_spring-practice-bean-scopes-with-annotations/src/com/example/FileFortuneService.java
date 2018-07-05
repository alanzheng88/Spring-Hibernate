package com.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class FileFortuneService implements FortuneService {

	private List<String> fortunes = new ArrayList<String>();
	
	public FileFortuneService() {
		System.out.println(">> inside constructor");
	}
	
	@PostConstruct
	private void init() throws IOException {
		System.out.println(">> inside init");
		String projectDir = System.getProperty("user.dir");
		String filePath = Paths.get(projectDir, 
							"src",
							"fortune-properties.txt").toString();
		System.out.println(filePath);
		BufferedReader in = null;
		try {
			in = new BufferedReader(new FileReader(filePath));
			while (in.ready()) {
				fortunes.add(in.readLine());
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			in.close();
		}
	}
	
	@PreDestroy
	private void destroy() {
		System.out.println(">> inside destroy");
	}
	
	@Override
	public String getFortune() {
		Random numGenerator = new Random();
		int randNum = numGenerator.nextInt(fortunes.size());
		return fortunes.get(randNum);
	}

}
