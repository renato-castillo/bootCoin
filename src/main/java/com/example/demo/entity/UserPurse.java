package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.math.BigDecimal;

@Getter
@Setter
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
