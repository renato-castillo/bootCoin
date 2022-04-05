package com.example.demo.controller;

import com.example.demo.entity.Transaction;
import com.example.demo.service.ITransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/transactions")
public class TransactionController {

    @Autowired
    private ITransactionService transactionService;

    @PostMapping
    public Mono<Transaction> createRequest(@RequestBody Transaction transaction) {
        return transactionService.create(transaction);
    }

}
