package com.example.apo.repository;

import com.example.apo.model.Alien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlienRepository extends JpaRepository<Alien,Integer> {

}
