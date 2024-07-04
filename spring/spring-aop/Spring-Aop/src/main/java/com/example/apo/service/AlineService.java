package com.example.apo.service;

import com.example.apo.model.Alien;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AlineService {
    Alien registerAlienInfo(Alien alien) throws Exception;
    List<Alien> getAllAlienInfo();
}
