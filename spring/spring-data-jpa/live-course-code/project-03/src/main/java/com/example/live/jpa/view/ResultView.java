package com.example.live.jpa.view;

import org.springframework.stereotype.Component;

@Component
public interface ResultView {
    String getVaccineName();
    String getVaccineManufactureBy();
}
