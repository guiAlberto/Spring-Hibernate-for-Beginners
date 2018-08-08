package com.luv2code.springdemo.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.luv2code.springdemo.Coach;
import com.luv2code.springdemo.FortuneService;

@Component
public class ScubaDiverCoach implements Coach {
	
	@Autowired
	@Qualifier("practiceFortuneService")
	FortuneService fortuneService;

	@Override
	public String getDailyWorkout() {
		return "Soak by 1 meter deep";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
