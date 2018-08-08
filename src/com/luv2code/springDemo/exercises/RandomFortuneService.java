package com.luv2code.springDemo.exercises;

import static java.util.Arrays.asList;

import java.util.List;
import java.util.Random;

import com.luv2code.springDemo.FortuneService;

public class RandomFortuneService implements FortuneService {

	private static final List<String> fortuneList = asList("Today is your lucky day", "Yesterday was your lucky day",
			"Tomorrow is gonna be your lucky day");

	@Override
	public String getFortune() {
		int index = new Random().nextInt(fortuneList.size());
		return fortuneList.get(index);
	}

}
