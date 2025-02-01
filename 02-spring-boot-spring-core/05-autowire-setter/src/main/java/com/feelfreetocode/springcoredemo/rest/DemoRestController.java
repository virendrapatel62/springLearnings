package com.feelfreetocode.springcoredemo.rest;

import com.feelfreetocode.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {
    private Coach myCoach;

    @Autowired
    public void setMyCoach(@Qualifier("footballCoach") Coach myCoach) {
        System.out.println("Setter Called");
        this.myCoach = myCoach;
    }

    @GetMapping("/")
    public String getHomeMessage(){
        return  "Hello Home :)";
    }

    @GetMapping("/daily-workout")
    public String getDailyWorkout(){
        System.out.println("Get Daily workout called...");
        return  this.myCoach.getDailyWorkout();
    }
}
