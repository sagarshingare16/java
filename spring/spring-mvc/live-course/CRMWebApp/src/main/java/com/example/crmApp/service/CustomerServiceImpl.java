package com.example.crmApp.service;

import com.example.crmApp.model.CustomerInfo;
import com.example.crmApp.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public List<CustomerInfo> getCustomersInfo() {
        return customerRepository.findAll();
    }

    @Override
    public void registerCustomer(CustomerInfo customerInfo) {
        customerRepository.save(customerInfo);

    }
}
