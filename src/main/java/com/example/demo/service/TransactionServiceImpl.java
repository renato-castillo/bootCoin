package com.example.demo.service;

import com.example.demo.entity.Transaction;
import com.example.demo.repository.ITransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import reactor.core.publisher.Mono;

import java.util.UUID;

public class TransactionServiceImpl implements ITransactionService {

    @Autowired
    private ITransactionRepository transactionRepository;

    @Override
    public Mono<Transaction> create(Transaction transaction) {
        return transactionRepository.save(transaction);
    }

    @Override
    public Mono<Transaction> acceptRequest(Transaction transaction) {
        return transactionRepository.findById(transaction.getTransactionId()).switchIfEmpty(Mono.empty())
                .flatMap(x -> {
                    x.setAccepted(transaction.getAccepted());
                    x.setTransactionId(UUID.randomUUID().toString());

                    return transactionRepository.save(x);
                });
    }


}
