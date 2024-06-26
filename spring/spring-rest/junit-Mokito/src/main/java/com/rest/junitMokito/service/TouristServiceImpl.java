package com.rest.junitMokito.service;

import com.rest.junitMokito.model.Tourist;

public class TouristServiceImpl implements TouristService{
    @Override
    public String registerTourist(Tourist tourist) {
        tourist.setTouristId(tourist.getTouristId());
        tourist.setTouristName(tourist.getTouristName());
        tourist.setDestinationCity(tourist.getDestinationCity());
        tourist.setBudget(tourist.getBudget());
        tourist.setPackageType(tourist.getPackageType());

        System.out.println(tourist);

        return "Tourist register successfully..";
    }
}
