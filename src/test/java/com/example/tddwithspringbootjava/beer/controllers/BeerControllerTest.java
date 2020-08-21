package com.example.tddwithspringbootjava.beer.controllers;

import com.example.tddwithspringbootjava.beer.model.Beer;
import com.example.tddwithspringbootjava.beer.services.BeerService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


@ExtendWith(SpringExtension.class)
class BeerControllerTest {
    @Mock
    private BeerService beerService;

    @InjectMocks
    private BeerController beerController;

//    @Test
//    void shouldStoreBeer(){
//        beerController.saveBeer(Beer);
//        verify(beerService).saveBeer();
//    }

    @Test
    void shouldGetBeerList() {
        var expectedBeerList = Beer.builder()
                .beerBrand("KingFisher")
                .beerName("Thunderbold")
                .beerPrice(200.96)
                .beerStatus(true)
                .beerType("Strong")
                .build();
        when(beerService.listBeer()).thenReturn(List.of(expectedBeerList));
        var actualBeerList = beerController.listBeer();
        assertThat(actualBeerList).isEqualTo(List.of(expectedBeerList));
        verify(beerService).listBeer();
    }

}
