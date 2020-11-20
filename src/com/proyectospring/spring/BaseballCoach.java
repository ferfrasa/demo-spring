package com.proyectospring.spring;

public class BaseballCoach implements Coach {
	
	//define a private field for the dependecy
	private  FortuneService fortuneService;
	
	//define constructor for dependency injection
    public BaseballCoach(FortuneService theFortuneService) {// se inyecta la dependencia
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on";
	}

	@Override
	public String getDailyFortune() {
		//use my fortuneService to get fortune
		
		return fortuneService.getFortune();
	}

}
