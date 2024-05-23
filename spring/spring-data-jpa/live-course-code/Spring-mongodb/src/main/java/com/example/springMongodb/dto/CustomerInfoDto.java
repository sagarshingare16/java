package com.example.springMongodb.dto;

import lombok.Data;

@Data
public class CustomerInfoDto {
    private String customerId;
    private String customerName;
    private String customerAddress;
}
