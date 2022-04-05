package com.example.demo.controller;

import com.example.demo.entity.Rate;
import com.example.demo.service.IRateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/rate")
public class RateController {

    @Autowired
    private IRateService rateService;

    @PostMapping
    public Mono<Rate> save(@RequestBody Rate rate) {
        return rateService.save(rate);
    }

    @PutMapping
    public Mono<Rate> update(@RequestBody Rate rate) {
        return rateService.save(rate);
    }
}
