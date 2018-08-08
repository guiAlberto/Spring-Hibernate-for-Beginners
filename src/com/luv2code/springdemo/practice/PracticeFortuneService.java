package com.luv2code.springdemo.practice;

import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.luv2code.springdemo.FortuneService;

@Component
public class PracticeFortuneService implements FortuneService {

	@Value("${fortunes}")
	private String fortune;

	@PostConstruct
	private void loadFortunes() {
		String[] fortunes = this.fortune.split(",");
		int index = new Random().nextInt(fortunes.length); 
		this.fortune = fortunes[index];
	}

	@Override
	public String getFortune() {
		return fortune;
	}

}
