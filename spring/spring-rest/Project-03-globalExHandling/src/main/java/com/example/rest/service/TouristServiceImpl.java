package com.example.rest.service;

import com.example.rest.model.Tourist;
import com.example.rest.reppository.TouristRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TouristServiceImpl implements TouristService{

    @Autowired
    TouristRepository repository;

    @Override
    public String registerTourist(Tourist tourist) {
        return "";
    }

    @Override
    public List<Tourist> getAllTourist() {
        return List.of();
    }

    @Override
    public Tourist getTouristById(Integer touristId) {
        return null;
    }

    @Override
    public String updateTouristInfo(Tourist tourist) {
        return "";
    }

    @Override
    public String updateTouristInfoById(Integer id, double touristBudget) {
        return "";
    }

    @Override
    public String deleteTouristById(Integer id) {
        return "";
    }
}
