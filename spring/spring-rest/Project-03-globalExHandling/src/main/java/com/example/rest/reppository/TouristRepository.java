package com.example.rest.reppository;

import com.example.rest.model.Tourist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TouristRepository extends JpaRepository<Tourist,Integer> {

}
