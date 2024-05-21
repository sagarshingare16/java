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
    public List<Vaccine> fetchByVaccineManufacturer(String manufacturerName) {
        return vaccineRepository.searchByVaccineManufacturer(manufacturerName);
    }

    @Override
    public List<Vaccine> fetchByVaccineManufacturer(String manufacturer1, String manufacturer2) {
        return vaccineRepository.searchByVaccineManufacturer(manufacturer1,manufacturer2);
    }

    @Override
    public List<String> fetchByVaccinePriceRange(Integer minPrice, Integer maxPrice) {
        return vaccineRepository.searchByVaccinePriceRange(minPrice, maxPrice);
    }

    @Override
    public List<Object[]> fetchVaccineInfoByVaccineName(String vaccineName1, String VaccineName2) {
        return vaccineRepository.searchVaccineInfoByVaccineName(vaccineName1, VaccineName2);
    }

    @Override
    public int updatePriceByVaccineName(Integer newPrice, String vaccine) {
        return vaccineRepository.updatePriceByVaccineName(newPrice,vaccine);
    }

    @Override
    public int deleteByVaccinePriceRange(Integer minVaccinePrice, Integer maxVaccinePrice) {
        return vaccineRepository.deleteByVaccinePriceRange(minVaccinePrice, maxVaccinePrice);
    }

    @Override
    public int insertVaccineDetails(Integer id, String name, String manufacturer, Integer price) {
        return vaccineRepository.insertVaccineDetails(id, name, manufacturer, price);
    }
}
