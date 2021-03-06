package com.example.tddwithspringbootjava.beer.services;

import com.example.tddwithspringbootjava.beer.model.Beer;
import com.example.tddwithspringbootjava.beer.repository.BeerRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(SpringExtension.class)
class BeerServiceTest {
    @Mock
    private BeerRepository beerRepository;

    @InjectMocks
    private BeerService beerService;

    @Test
    void shouldFetchBeerList(){
        var expectedBeerList = Beer.builder()
                .beerBrand("KingFisher")
                .beerName("Thunderbold")
                .beerPrice(200.96)
                .beerStatus(true)
                .beerType("Strong")
                .build();
        when(beerRepository.findAll()).thenReturn(List.of(expectedBeerList));
        List<Beer> actualBeerList = beerService.listBeer();
        assertThat(actualBeerList).isEqualTo(List.of(expectedBeerList));
    }

}
