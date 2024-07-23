package com.springJwt.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "entity_details" )
public class EntityDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String email;
    private String password;
}
