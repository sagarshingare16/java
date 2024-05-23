package com.example.springMongodb.service;

import com.example.springMongodb.dto.CustomerInfoDto;
import com.example.springMongodb.model.CustomerInfo;
import com.example.springMongodb.repository.CustomerInfoRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerInfoServiceImpl implements CustomerInfoService{

    @Autowired
    CustomerInfoRepository customerInfoRepository;


    @Override
    public String registerCustomerDetails(CustomerInfo customerInfo) {
        CustomerInfo customerInfo1 = customerInfoRepository.save(customerInfo);
        return "Successfully saved " + customerInfo1;
    }

    @Override
    public CustomerInfo findCustomerDetailsById(String customerId) {
         boolean status = customerInfoRepository.findById(customerId).isPresent();
         if (status){
             return customerInfoRepository.findById(customerId).get();
         }
         return null;
    }
}
