package com.example.crmApp.repository;

import com.example.crmApp.model.CustomerInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerInfo,Integer> {

}
