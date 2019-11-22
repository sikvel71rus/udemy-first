package com.luv2code.springdemo;

public class CricketCoach implements Coach {

    public void setTeam(String team) {
        System.out.println("CricketCoach: inside setTeam");
        this.team = team;
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println("CricketCoach: inside setEmailAddress");
        this.emailAddress = emailAddress;
    }

    //    add new fields emailadress and team
    private String team;
    private String emailAddress;

    public String getTeam() {
        return team;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    private FortuneService fortuneService;

//    our non-arg constructor
    private CricketCoach(){
        System.out.println("CricketCoach: inside non arg constructor");
    }

    //our setter method
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("CricketCoach: inside setFortuneService");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice bouling";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }


}
