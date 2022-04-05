package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Getter
@Setter
@Document
public class UserPurse {

    @Id
    private String id;

    private String document;

    private String documentType;

    private String cellphone;

    private String email;

    private String userType;

    private BigDecimal balance;
}
