package com.example.live.jpa.springdatajpa.service;

import com.example.live.jpa.springdatajpa.model.Vaccine;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface VaccineService {
    /*String registerVaccineInfo(Vaccine vaccine);
    Iterable<Vaccine> registerMultipleVaccines(Iterable<Vaccine> vaccines);
    Long getVaccinesCount();
    Boolean checkAvailability(Integer vaccineId);
    Iterable<Vaccine> getAllVaccinesInfo();
    Iterable<Vaccine> getAllVaccinesInfoSpecific(Iterable<Integer> vaccineIds);
    Optional<Vaccine> getVaccineById(Integer vaccineId);
    String removeVaccineById(Integer vaccineId);
    String deleteVaccinesById(List<Integer> vaccineIds);
    String deleteVaccineByVaccineObj(Vaccine vaccine);*/

    /*Iterable<Vaccine> fetchDetails(boolean status, String... properties);
    List<Vaccine> fetchDetails(int pgNo, int PgSize,boolean status, String... properties);
    void fetchDetailsPagination(int pageSize);*/

    List<Vaccine> searchByGivenVaccineInfo(Vaccine vaccine, boolean status, String... properties);


}
