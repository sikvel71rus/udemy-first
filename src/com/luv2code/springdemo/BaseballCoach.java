package com.luv2code.springdemo;

public class BaseballCoach implements Coach {

    //define a private field for dependency
    private FortuneService fortuneService;

    public BaseballCoach(){}

    //define a constructor for dependency
    public BaseballCoach(FortuneService thefortuneService){
        fortuneService = thefortuneService;
    }

    @Override
    public String getDailyWorkout(){
        return "Spend 30 munutese on batting practice";
    }

    @Override
    public String getDailyFortune() {
        //use my fortuneService to get a fortune
        return fortuneService.getFortune();
    }
}
