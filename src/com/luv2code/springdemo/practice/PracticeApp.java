package com.luv2code.springdemo.practice;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.luv2code.springdemo.Coach;

public class PracticeApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"/com/luv2code/springdemo/practice/practiceApplicationContext.xml");
		Coach coach = context.getBean("scubaDiverCoach", Coach.class);
		System.out.println(coach.getDailyWorkout());
		context.close();
	}

}
