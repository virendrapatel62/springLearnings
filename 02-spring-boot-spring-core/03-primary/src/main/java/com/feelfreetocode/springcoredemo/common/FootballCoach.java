package com.feelfreetocode.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component @Primary
public class FootballCoach implements  Coach{

   public FootballCoach(){
       System.out.println("Football Constructor called...");
   }

    @Override
    public String getDailyWorkout() {
        return "Practice football for 15 minutes....";
    }
}
