package com.example.tddwithspringbootjava.beer.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Beer {
    private String beerName;
    private String beerBrand;
    private String beerType;
    private boolean beerStatus;
    private double beerPrice;
}
