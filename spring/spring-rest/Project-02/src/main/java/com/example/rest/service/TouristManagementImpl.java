package com.example.rest.service;

import com.example.rest.model.Tourist;
import com.example.rest.repository.TouristRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TouristManagementImpl implements TouristManagement{

    @Autowired
    TouristRepository repository;

    @Override
    public String registerTourist(Tourist tourist) {
        Integer touristId = repository.save(tourist).getTouristId();
        return "Tourist registered successfully with id: "+tourist;
    }

    @Override
    public List<Tourist> getAllTourist() {
        return repository.findAll();
    }

    @Override
    public Tourist getTouristById(Integer touristId) {
        return repository.findById(touristId).orElseThrow();
    }
}
