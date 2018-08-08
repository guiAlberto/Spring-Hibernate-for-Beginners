package com.luv2code.springDemo.exercises;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExerciseApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/luv2code/springDemo/exercises/exercicesApplicationContext.xml");
		SwimmingCoach theCoach = context.getBean("mySwimmingCoach", SwimmingCoach.class);
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		context.close();
	}

}
