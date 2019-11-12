package com.luv2code.springdemo;

public class SwimingCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Swim like a Felps";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
