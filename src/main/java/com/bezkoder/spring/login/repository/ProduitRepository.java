package com.bezkoder.spring.login.repository;

import com.bezkoder.spring.login.models.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<Produit, Long> {

}
