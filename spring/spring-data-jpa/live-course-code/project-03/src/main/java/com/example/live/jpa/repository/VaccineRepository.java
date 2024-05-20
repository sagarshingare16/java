package com.example.live.jpa.repository;

import com.example.live.jpa.model.Vaccine;
import com.example.live.jpa.view.ResultView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface VaccineRepository extends JpaRepository<Vaccine,Integer> {

    //static finder
    List<ResultView> findByVaccinePriceLessThan(Integer price);
}
