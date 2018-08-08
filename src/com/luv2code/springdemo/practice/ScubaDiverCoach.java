package com.luv2code.springdemo.practice;

import org.springframework.stereotype.Component;

import com.luv2code.springdemo.Coach;

@Component
public class ScubaDiverCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Soak by 1 meter deep";
	}

}
