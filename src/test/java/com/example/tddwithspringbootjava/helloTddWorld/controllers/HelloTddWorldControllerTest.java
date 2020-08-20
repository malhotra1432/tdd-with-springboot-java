package com.example.tddwithspringbootjava.helloTddWorld.controllers;

import com.example.tddwithspringbootjava.helloTddWorld.services.HelloTddWorldService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;

@ExtendWith(SpringExtension.class)
class HelloTddWorldControllerTest {
    @Mock
    private HelloTddWorldService helloTddWorldService;

    @InjectMocks
    private HelloTddWorldController helloTddWorldController;

    @Test
    void shouldGreetTddWorld(){
        helloTddWorldController.greetTddWorld();
        verify(helloTddWorldService).getGreetTddWorld();
    }

}
