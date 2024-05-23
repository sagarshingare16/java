package com.example.springMongodb.repository;

import com.example.springMongodb.model.CustomerInfo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerInfoRepository extends MongoRepository<CustomerInfo,String> {

}
