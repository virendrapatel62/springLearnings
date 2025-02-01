package com.feelfreetocode.springcoredemo.rest;

import com.feelfreetocode.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {
    private Coach myCoach;

    @Autowired
    public DemoRestController(Coach theCoach) {
        System.out.println("Demo REst Controller Constructor called...");
        myCoach = theCoach;
    }

    @GetMapping("/")
    public String getHomeMessage(){
        return  "Component Scanning Example From Packages";
    }

    @GetMapping("/daily-workout")
    public String getDailyWorkout(){
        System.out.println("Get Daily workout called...");
        return  this.myCoach.getDailyWorkout();
    }
}
