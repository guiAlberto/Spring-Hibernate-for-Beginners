package com.luv2code.springdemo.practice;

import com.luv2code.springdemo.FortuneService;

public class WetFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Beware of the sharks";
	}

}
