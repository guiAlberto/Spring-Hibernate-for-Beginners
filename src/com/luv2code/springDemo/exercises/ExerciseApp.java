package com.luv2code.springDemo.exercises;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExerciseApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/luv2code/springDemo/exercises/exercicesApplicationContext.xml");
		SwimmingCoach coachA = context.getBean("mySwimmingCoachSingleton", SwimmingCoach.class);
		SwimmingCoach coachB = context.getBean("mySwimmingCoachSingleton", SwimmingCoach.class);
		SwimmingCoach coachC = context.getBean("mySwimmingCoachPrototype", SwimmingCoach.class);
		SwimmingCoach coachD = context.getBean("mySwimmingCoachPrototype", SwimmingCoach.class);

		System.out.println("coachA == coachB: " + (coachA == coachB));
		System.out.println("coachC == coachD: " + (coachC == coachD));

		context.close();
	}

}
