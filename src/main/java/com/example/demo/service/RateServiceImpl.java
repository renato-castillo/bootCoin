package com.example.demo.service;

import com.example.demo.entity.Rate;
import com.example.demo.repository.IRateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import reactor.core.publisher.Mono;

public class RateServiceImpl implements IRateService {

    @Autowired
    private IRateRepository rateRepository;

    @Override
    public Mono<Rate> save(Rate rate) {
        return rateRepository.save(rate);
    }
}
