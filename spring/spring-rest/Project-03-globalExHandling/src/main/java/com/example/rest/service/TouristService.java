package com.example.rest.service;

import com.example.rest.model.Tourist;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TouristService {
    String registerTourist(Tourist tourist);
    List<Tourist> getAllTourist();
    Tourist getTouristById(Integer touristId);
    String updateTouristInfo(Tourist tourist);
    String updateTouristInfoById(Integer touristId,double touristBudget);
    String deleteTouristById(Integer touristId);
}
