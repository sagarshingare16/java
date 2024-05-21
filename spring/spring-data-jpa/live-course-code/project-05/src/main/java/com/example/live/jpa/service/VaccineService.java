package com.example.live.jpa.service;


import com.example.live.jpa.model.Vaccine;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface VaccineService {
    List<Vaccine> fetchByVaccineManufacturer(String manufacturerName);
    /*List<Vaccine> fetchByVaccineManufacturer(String manufacturer1, String manufacturer2);
    List<String> fetchByVaccinePriceRange(Integer minPrice, Integer maxPrice);
    List<Object[]> fetchVaccineInfoByVaccineName(String vaccineName1,String VaccineName2);
    int updatePriceByVaccineName(Integer newPrice,String vaccine);
    int deleteByVaccinePriceRange(Integer minVaccinePrice, Integer maxVaccinePrice);
    int insertVaccineDetails(Integer id,String name, String manufacturer, Integer price);*/

}
