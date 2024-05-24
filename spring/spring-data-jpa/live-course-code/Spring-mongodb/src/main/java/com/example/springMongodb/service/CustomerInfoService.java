package com.example.springMongodb.service;

import com.example.springMongodb.model.CustomerInfo;
import org.springframework.stereotype.Service;


@Service
public interface CustomerInfoService {
    String registerCustomerDetails(CustomerInfo customerInfo);
    CustomerInfo findCustomerDetailsById(String customerId);
    String deleteCustomerDetailsById(String customerId);

}
