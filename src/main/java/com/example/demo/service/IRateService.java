package com.example.demo.service;

import com.example.demo.entity.Rate;
import reactor.core.publisher.Mono;

public interface IRateService {

    Mono<Rate> save(Rate rate);
}
