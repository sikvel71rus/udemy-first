package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
    public static void main(String[] args) {

        // load the spring configuration file

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        //retrieve bean from the sping container
        Coach theCoach = context.getBean("myCoach",Coach.class);

        Coach alphaCoach = context.getBean("myCoach",Coach.class);

//        check if they are the same bean
        boolean result = (theCoach == alphaCoach);


        //print result
        System.out.println("Same object " + result);

        System.out.println("Memory location theCoach " + theCoach);

        System.out.println("Memory location alphaCoach " + alphaCoach);

        //close context

        context.close();;

    }
}
