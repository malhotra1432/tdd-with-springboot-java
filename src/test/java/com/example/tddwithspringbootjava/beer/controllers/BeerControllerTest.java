//package com.example.tddwithspringbootjava.beer.controllers;
//
//import com.example.tddwithspringbootjava.beer.model.Beer;
//import com.example.tddwithspringbootjava.beer.services.BeerService;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.springframework.test.context.junit.jupiter.SpringExtension;
//
//import javax.swing.*;
//
//import static org.junit.jupiter.api.Assertions.*;
//import static org.mockito.Mockito.verify;
//
//@ExtendWith(SpringExtension.class)
//class BeerControllerTest {
//    @Mock
//    private BeerService beerService;
//
//    @InjectMocks
//    private BeerController beerController;
//
//    @Test
//    void shouldStoreBeer(){
//        beerController.saveBeer(Beer);
//        verify(beerService).saveBeer();
//    }
//
//}
