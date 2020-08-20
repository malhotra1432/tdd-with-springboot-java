package com.example.tddwithspringbootjava.beer.services;

import com.example.tddwithspringbootjava.beer.model.Beer;
import com.example.tddwithspringbootjava.beer.repository.BeerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BeerService {

    private final BeerRepository beerRepository;

    @Autowired
    public BeerService(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }


    public void saveBeer(Beer beer) {
        beerRepository.save(beer);

    }

    public List<Beer> listBeer() {
        return beerRepository.findAll();
    }
}
