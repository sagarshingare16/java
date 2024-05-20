package com.example.live.jpa.repository;

import com.example.live.jpa.model.Vaccine;
import com.example.live.jpa.view.View;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface VaccineRepository extends JpaRepository<Vaccine,Integer> {

    public <T extends View> List<T> findByVaccinePrice(Integer price, Class<T> cls);
}
