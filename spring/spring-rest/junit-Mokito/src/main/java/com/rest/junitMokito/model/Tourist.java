package com.rest.junitMokito.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tourist {
    private Integer touristId;
    private String touristName;
    private String destinationCity;
    private String packageType;
    private Double budget;
}
