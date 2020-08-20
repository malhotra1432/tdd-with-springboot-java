package com.example.tddwithspringbootjava.helloTddWorld.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(SpringExtension.class)
class HelloTddWorldServiceTest {

    @InjectMocks
    private HelloTddWorldService helloTddWorldService;

    @Test
    void shouldGetGreetTddWorld(){
        String expected = "Hello TDD WORLD!";
        String actual = helloTddWorldService.getGreetTddWorld();
        assertThat(actual).isEqualTo(expected);
    }
}
