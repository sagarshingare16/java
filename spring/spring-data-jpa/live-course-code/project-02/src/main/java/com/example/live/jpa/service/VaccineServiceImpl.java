package com.example.live.jpa.service;

import com.example.live.jpa.model.Vaccine;
import com.example.live.jpa.repository.VaccineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VaccineServiceImpl implements VaccineService{

    @Autowired
    VaccineRepository vaccineRepository;

    @Override
    public List<Vaccine> getVaccineByPrice(Integer vaccinePrice) {
        return vaccineRepository.findByVaccinePrice(vaccinePrice);
    }
}
