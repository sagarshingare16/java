package com.example.multidb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.multidb.model.PortfolioTxn;

@Repository
public interface PortfolioRepository extends JpaRepository<PortfolioTxn,Integer> {

}
