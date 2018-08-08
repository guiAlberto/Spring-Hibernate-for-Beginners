package com.luv2code.springDemo.exercises;

import com.luv2code.springDemo.Coach;
import com.luv2code.springDemo.FortuneService;

public class SwimmingCoach implements Coach {

	private FortuneService fortuneService;

	public SwimmingCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Swim from Tokyo to Shanghai!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
}
