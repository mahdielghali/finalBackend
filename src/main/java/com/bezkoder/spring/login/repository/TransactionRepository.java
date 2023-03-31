package com.bezkoder.spring.login.repository;

import com.bezkoder.spring.login.models.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    @Query(value = " SELECT * FROM transaction  WHERE type_transaction = 'vente_integre'" , nativeQuery = true)
    public List<Transaction> name();
    @Query(value = "SELECT * FROM transaction", nativeQuery = true)
    public List<Transaction> nbTransaction();
    @Query(value = " SELECT * FROM transaction  WHERE type_transaction = 'non_selectionee'" , nativeQuery = true)
    public List<Transaction> non_selectionee();
    @Query(value = " SELECT * FROM transaction  WHERE type_transaction = 'services'" , nativeQuery = true)
    public List<Transaction> services();
    @Query(value = " SELECT * FROM transaction  WHERE type_transaction = 'service_apre_vente'" , nativeQuery = true)
    public List<Transaction> service_apre_vente();
    @Query(value = " SELECT * FROM Transaction WHERE date_ajout >= '2023-01-01'" , nativeQuery = true)
    public List<Transaction> dateAjout();

}
