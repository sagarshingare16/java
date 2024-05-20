package com.example.live.jpa.springdatajpa.model;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "vaccine_info")
public class Vaccine {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "vaccine_id")
    private Integer vaccineId;
    @Column(name = "vaccine_name")
    private String vaccineName;
    @Column(name = "vaccine_manufacture_by")
    private String vaccineManufactureBy;
    @Column(name = "vaccine_price")
    private Integer vaccinePrice;

}
