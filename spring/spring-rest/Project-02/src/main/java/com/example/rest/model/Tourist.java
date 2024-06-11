package com.example.rest.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tourist_info")
public class Tourist {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer touristId;
    private String touristName;
    private String touristCity;
    private String touristPackage;
    private double touristBudget;
}
