package com.example.rest.service;

import com.example.rest.model.Tourist;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TouristManagement {
    String registerTourist(Tourist tourist);
    List<Tourist> getAllTourist();
    Tourist getTouristById(Integer touristId);

}
