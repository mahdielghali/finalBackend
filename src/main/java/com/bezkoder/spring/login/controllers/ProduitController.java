package com.bezkoder.spring.login.controllers;

import com.bezkoder.spring.login.models.Produit;
import com.bezkoder.spring.login.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/produit")

public class ProduitController {
    @Autowired

    private ProduitService produitService;

    @PostMapping("/create")
    public Produit create(@RequestBody Produit produit) {
        return produitService.creer(produit);
    }

    @GetMapping("/read")
    public List<Produit> read() {
        return produitService.lire();
    }

    @PutMapping("/update/{id}")
    public Produit update(@PathVariable Long id, @RequestBody Produit produit) {
        return produitService.modifier(id, produit);
    }

    @DeleteMapping("/delete/{id}")
    public String detete(@PathVariable Long id) {
        return produitService.supprimer(id);
    }
}
