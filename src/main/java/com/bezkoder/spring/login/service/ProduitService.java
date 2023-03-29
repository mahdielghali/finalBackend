package com.bezkoder.spring.login.service;

import com.bezkoder.spring.login.models.Produit;

import java.util.List;

public interface ProduitService {
    Produit creer(Produit produit);
    List<Produit> lire();
    Produit modifier(Long id, Produit produitr);
    String supprimer(Long id);
}
