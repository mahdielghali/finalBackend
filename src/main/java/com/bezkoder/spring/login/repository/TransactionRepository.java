package com.bezkoder.spring.login.repository;

import com.bezkoder.spring.login.models.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {

}
