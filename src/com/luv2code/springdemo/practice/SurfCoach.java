package com.luv2code.springdemo.practice;

import com.luv2code.springdemo.Coach;
import com.luv2code.springdemo.FortuneService;

public class SurfCoach implements Coach {

	private FortuneService wetFortuneService;

	public SurfCoach(FortuneService wetFortuneService) {
		this.wetFortuneService = wetFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Surf a 20 meters height wave";
	}

	@Override
	public String getDailyFortune() {
		return wetFortuneService.getFortune();
	}

}
