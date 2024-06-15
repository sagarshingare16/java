package com.example.multidb.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "portfolio_txn")
public class PortfolioTxn {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer txnId;
    private String txnAmount;
}
