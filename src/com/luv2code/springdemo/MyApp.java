package com.luv2code.springdemo;

import java.util.ArrayList;
import java.util.List;

public class MyApp {
    public static void main(String[] args) {
        //create the object
        Coach theCoach = new TrackCoach();

        //use the object
        System.out.println(theCoach.getDailyWorkout());


        TrackCoach testCoach = new TrackCoach();
        List<TrackCoach> testList2 = new ArrayList<TrackCoach>();
        testList2.add(testCoach);
        testList2.add(theCoach);


        System.out.println("------------");
        Coach theCoach1 = new BaseballCoach();
        BaseballCoach theCoach2 = new BaseballCoach();

        List<Coach> testList = new ArrayList<Coach>() ;
        testList.add(theCoach);
        testList.add(theCoach1);
        testList.add(theCoach2);
        for (Coach coach:testList
             ) {
            System.out.println(coach.getDailyWorkout());

        }


    }
}
