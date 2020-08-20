package com.example.tddwithspringbootjava.helloTddWorld.controllers;

import com.example.tddwithspringbootjava.helloTddWorld.services.HelloTddWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloTddWorldController {
    private final HelloTddWorldService tddWorldService;

    @Autowired
    public HelloTddWorldController(HelloTddWorldService tddWorldService) {
        super();
        this.tddWorldService = tddWorldService;
    }

    @GetMapping("hello/tdd")
    public String greetTddWorld(){
        return tddWorldService.getGreetTddWorld();
    }
}
