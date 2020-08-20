package com.example.tddwithspringbootjava.helloTddWorld.services;

import org.springframework.stereotype.Service;

@Service
public class HelloTddWorldService {
    public String getGreetTddWorld(){
        return "Hello TDD WORLD!";
    }
}
