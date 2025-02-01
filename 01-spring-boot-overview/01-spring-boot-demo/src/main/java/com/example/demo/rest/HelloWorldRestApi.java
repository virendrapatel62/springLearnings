package com.example.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloWorldRestApi {

    @GetMapping("/")
    public Map<String, String> getHelloWorld() {
        var response =  new HashMap<String , String>();
        response.put("message" , "Hello World..");
        return response;
    }
}
