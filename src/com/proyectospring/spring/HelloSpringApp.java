package com.proyectospring.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//load the spring configuration file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container
		//id del bean y Interfaz que se implemementara
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		Coach theCoachFutbol = context.getBean("myCoachFutbol", Coach.class);

		//call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoachFutbol.getDailyWorkout());
		
		// lets call our new method for fortunes
		System.out.println(theCoach.getDailyFortune());
		
		//close the contex
		context.close();

	}

}
