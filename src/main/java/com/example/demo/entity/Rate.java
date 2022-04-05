package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Getter
@Setter
@Document
public class Rate {

    @Id
    private String id;

    private BigDecimal buyRate;

    private BigDecimal sellRate;

    private String coinType;
}
