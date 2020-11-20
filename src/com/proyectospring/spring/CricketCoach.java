package com.proyectospring.spring;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	//add new fields for emailAddress and team
	private String emailAddress;
	private String team;
	
	

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("setter methosemail");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("setter methos Team");
		this.team = team;
	}

	public CricketCoach() {
		System.out.println("constructor sin parametros crick");
	}
	
	//setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("setter methos");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practica rapido bowwñp";
	}

	

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
