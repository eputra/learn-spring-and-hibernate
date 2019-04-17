package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class CodingCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Coding-coding";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
