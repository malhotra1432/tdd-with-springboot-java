package com.example.tddwithspringbootjava.beer.repository;

import com.example.tddwithspringbootjava.beer.model.Beer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SpringExtension.class)
class BeerRepositoryTest {
    private BeerRepository beerRepository;

    @Autowired
    private MongoTemplate mongoTemplate;

    @Test
    void shouldFetchBeerList() throws Exception {
        var expectedBeerList = Beer.builder()
                .beerBrand("KingFisher")
                .beerName("Thunderbold")
                .beerPrice(200.96)
                .beerStatus(true)
                .beerType("Strong")
                .build();
        List<Beer> beerList = beerRepository.findAll();
        assertThat(beerList).isEqualTo(List.of(expectedBeerList));
    }

}
