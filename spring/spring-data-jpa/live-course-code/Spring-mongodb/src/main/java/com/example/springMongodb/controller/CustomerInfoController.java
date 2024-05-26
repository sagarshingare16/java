package com.example.springMongodb.controller;

import com.example.springMongodb.model.CustomerInfo;
import com.example.springMongodb.service.CustomerInfoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1/customerInfo")
public class CustomerInfoController {

    @Autowired
    CustomerInfoServiceImpl customerInfoService;

    @PostMapping("/register")
    public ResponseEntity<String> registerCustomerInfo(@RequestBody CustomerInfo customerInfo){
        return new ResponseEntity<>(customerInfoService.registerCustomerDetails(customerInfo),HttpStatus.CREATED);
    }

    @GetMapping("/{customerId}")
    public ResponseEntity<CustomerInfo> getCustomerInfo(@PathVariable String customerId){
        return new ResponseEntity<>(customerInfoService.findCustomerDetailsById(customerId), HttpStatus.OK);
    }

    @DeleteMapping("/{customerId}")
    public ResponseEntity<String> deleteCustomerById(@PathVariable String customerId){
        return new ResponseEntity<>(customerInfoService.deleteCustomerDetailsById(customerId),HttpStatus.OK);
    }

}
