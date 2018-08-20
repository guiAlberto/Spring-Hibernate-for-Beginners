package com.luv2code.springdemo.practice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.luv2code.springdemo.Coach;
import com.luv2code.springdemo.FortuneService;

@Configuration
public class JavaConfigPracticeApp {

	// define bean for wet fortune service
	@Bean
	public FortuneService wetFortuneService() {
		return new WetFortuneService();
	}

	@Bean
	// define bean for surfCoach and inject dependency
	public Coach surfCoach() {
		return new SurfCoach(wetFortuneService());
	}

}
