package com.example.crmApp.service;

import com.example.crmApp.model.CustomerInfo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CustomerService {
    List<CustomerInfo> getCustomersInfo();
    void registerCustomer(CustomerInfo customerInfo);
}
