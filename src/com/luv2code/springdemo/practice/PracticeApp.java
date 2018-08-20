package com.luv2code.springdemo.practice;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PracticeApp {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				JavaConfigPracticeApp.class);

		SurfCoach coach = context.getBean("surfCoach", SurfCoach.class);

		System.out.println(coach.getDailyWorkout());

		System.out.println(coach.getDailyFortune());

		context.close();
	}

}
