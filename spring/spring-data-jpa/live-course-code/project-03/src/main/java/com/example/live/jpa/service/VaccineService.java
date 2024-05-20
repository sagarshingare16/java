package com.example.live.jpa.service;

import com.example.live.jpa.view.ResultView;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface VaccineService {
    List<ResultView> getVaccinePriceLessThan(Integer price);

}
