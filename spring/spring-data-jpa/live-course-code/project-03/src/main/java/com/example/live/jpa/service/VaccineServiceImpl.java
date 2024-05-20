package com.example.live.jpa.service;


import com.example.live.jpa.repository.VaccineRepository;
import com.example.live.jpa.view.ResultView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class VaccineServiceImpl implements VaccineService{

    @Autowired
    VaccineRepository vaccineRepository;


    @Override
    public List<ResultView> getVaccinePriceLessThan(Integer price) {
        return vaccineRepository.findByVaccinePriceLessThan(price);
    }
}
