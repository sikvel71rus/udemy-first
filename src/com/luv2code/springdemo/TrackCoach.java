package com.luv2code.springdemo;

public class TrackCoach implements Coach {
    private FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public TrackCoach() {

    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return "Just Do IT: " +fortuneService.getFortune();
    }

    // add an init method
    public void doMyStartupStaff(){
        System.out.println("TrackCoach: inside method doMyStartupStuff");
    }

    // add a destroy method
    public void doMyCleanupStaffYoYo(){
        System.out.println("TrackCoach: inside method doMyCleanupStaffYoYo");
    }
}
