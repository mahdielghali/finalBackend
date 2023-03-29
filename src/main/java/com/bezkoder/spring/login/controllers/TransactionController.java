package com.bezkoder.spring.login.controllers;

import com.bezkoder.spring.login.models.Transaction;
import com.bezkoder.spring.login.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transaction")

public class TransactionController {
    @Autowired
    TransactionService transactionService;

    @PostMapping("/create")
    public Transaction create(@RequestBody Transaction transaction) {
        return transactionService.creer(transaction);
    }

    @GetMapping("/read")
    public List<Transaction> read() {
        return transactionService.lire();
    }

    @PutMapping("/update/{id}")
    public Transaction update(@PathVariable Long id, @RequestBody Transaction transaction) {
        return transactionService.modifier(id, transaction);
    }

    @DeleteMapping("/delete/{id}")
    public String detete(@PathVariable Long id) {
        return transactionService.supprimer(id);
    }

}
