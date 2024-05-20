package com.example.live.jpa.repository;

import com.example.live.jpa.model.Vaccine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface VaccineRepository extends JpaRepository<Vaccine,Integer> {

    //findByProperties methods
    List<Vaccine> findByVaccinePrice(Integer price);
    List<Vaccine> findByVaccineManufactureBy(String manufacturer);

    //findByPropertyKeywords
    List<Vaccine> findByVaccineNameEquals(String name);
    List<Vaccine> findByVaccineManufactureByIs(String manufacturer);

    List<Vaccine> findByPriceLessThan(Integer cost);
    List<Vaccine> indByPriceBetween(Integer startPrice, Integer endPrice);

    List<Vaccine> findByVaccineNameInVaccinePriceAndBetween(Collection<String> vaccines, Integer startPrice, Integer endPrice);
}
