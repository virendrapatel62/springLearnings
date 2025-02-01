package com.feelfreetocode.springcoredemo;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements  Coach{

   public CricketCoach(){
       System.out.println("Cricket Constructor called...");
   }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes....";
    }
}
