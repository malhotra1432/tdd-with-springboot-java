package com.example.tddwithspringbootjava.beer.controllers;

import com.example.tddwithspringbootjava.beer.model.Beer;
import com.example.tddwithspringbootjava.beer.services.BeerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BeerController {
    private final BeerService beerService;

    @Autowired
    public BeerController(BeerService beerService) {
        this.beerService = beerService;
    }

    @PostMapping("/store/beer")
    public void saveBeer(@RequestBody Beer beer) {
        beerService.saveBeer(beer);
    }

    @GetMapping("/list/beer")
    public List<Beer> listBeer() {
        return beerService.listBeer();
    }
}
