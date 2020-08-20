package com.example.tddwithspringbootjava.beer.repository;

import com.example.tddwithspringbootjava.beer.model.Beer;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Repository;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

@Repository
@SpringBootApplication
public interface BeerRepository extends MongoRepository<Beer, String>{
    @Override
    Beer save(Beer entity);

    @Override
    List<Beer> findAll();
}
