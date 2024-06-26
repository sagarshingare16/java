package com.example.live.jpa.service;

import com.example.live.jpa.model.Vaccine;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface VaccineService {
    List<Vaccine> getVaccineByPrice(Integer price);
    List<Vaccine> getVaccineBYManufacturer(String manufacturer);
    List<Vaccine> getVaccineByNameEquals(String name);

}
