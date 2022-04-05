package com.example.demo.repository;

import com.example.demo.entity.Transaction;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ITransactionRepository extends ReactiveMongoRepository<Transaction, String> {
}
