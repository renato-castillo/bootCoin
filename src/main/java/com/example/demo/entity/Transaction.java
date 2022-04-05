package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document
public class Transaction {

    @Id
    private String id;

    private String amount;

    private String paymentMethod;

    private Boolean accepted;

    private String transactionId;

    private String documentOrigin;

    private String documentDestination;
}
