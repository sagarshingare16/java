package com.example.live.jpa.repository;

import com.example.live.jpa.model.Vaccine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VaccineRepository extends JpaRepository<Vaccine,Integer> {
    List<Vaccine> findByVaccinePrice(Integer vaccinePrice);
}
