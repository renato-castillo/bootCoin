package com.example.demo.repository;

import com.example.demo.entity.Rate;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface IRateRepository extends ReactiveMongoRepository<Rate, String> {
}
