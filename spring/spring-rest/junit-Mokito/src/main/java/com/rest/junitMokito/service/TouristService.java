package com.rest.junitMokito.service;

import com.rest.junitMokito.model.Tourist;
import org.springframework.stereotype.Service;

@Service
public interface TouristService {
    String registerTourist(Tourist tourist);
}
