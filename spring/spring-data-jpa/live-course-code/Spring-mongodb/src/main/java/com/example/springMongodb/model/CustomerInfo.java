package com.example.springMongodb.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "customerInfo")
public class CustomerInfo {
    @Id
    private String customerId;
    private String customerName;
    private String customerAddress;
}
