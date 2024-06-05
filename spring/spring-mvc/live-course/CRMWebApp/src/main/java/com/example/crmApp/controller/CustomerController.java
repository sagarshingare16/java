package com.example.crmApp.controller;

import com.example.crmApp.model.CustomerInfo;
import com.example.crmApp.service.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class CustomerController {

    @Autowired
    CustomerServiceImpl customerService;

    @GetMapping("/customerList")
    public String getCustomerInfo(Model model){
        List<CustomerInfo> customerInfoList = customerService.getCustomersInfo();
        model.addAttribute("customers",customerInfoList);
        return "customerList";

    }

}
