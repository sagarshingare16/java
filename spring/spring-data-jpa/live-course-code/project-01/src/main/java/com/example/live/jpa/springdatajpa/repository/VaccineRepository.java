package com.example.live.jpa.springdatajpa.repository;

import com.example.live.jpa.springdatajpa.model.Vaccine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.Vector;

@Repository
/*
public interface VaccineRepository extends CrudRepository<Vaccine,Integer>{
}
*/

/*
public interface VaccineRepository extends PagingAndSortingRepository<Vaccine,Integer> {

}
*/

public interface VaccineRepository extends JpaRepository<Vaccine,Integer>{

}
