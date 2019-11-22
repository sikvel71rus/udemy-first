package com.luv2code.springdemo;

import java.util.ArrayList;
import java.util.Arrays;

public class RandomFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        ArrayList <String> randomList = new ArrayList<String>(Arrays.asList("1","2","3"));
        int randomNumber = (int)(Math.random()*randomList.size());
        return randomList.get(randomNumber);
    }

}
