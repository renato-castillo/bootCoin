package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Getter
@Setter
@Document
public class Transaction {

    @Id
    private String id;

    private String amount;

    private String paymentMethod;

    private Boolean accepted = false;

    private String transactionId;

    private String documentOrigin;

    private String documentDestination;

    private LocalDateTime transactionDate;

    private LocalDateTime transactionAcceptedDate;
}
