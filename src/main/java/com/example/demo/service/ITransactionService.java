package com.example.demo.service;

import com.example.demo.entity.Transaction;
import reactor.core.publisher.Mono;

public interface ITransactionService {

    Mono<Transaction> requestBuy(Transaction transaction);
}
