package com.bezkoder.spring.login.controllers;

import com.bezkoder.spring.login.models.Adresse;
import com.bezkoder.spring.login.service.AdresseService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/adresse")
@AllArgsConstructor

public class AdresseController {
    private final AdresseService adresseService;
    @PostMapping("/create")
    public Adresse create(@RequestBody Adresse adresse){
        return adresseService.creer(adresse);
    }
    @GetMapping("/read")
    public List<Adresse> read() {
        return adresseService.lire();
    }
    @PutMapping("/update/{id}")
    public Adresse update(@PathVariable Long id, @RequestBody Adresse adresse){
        return adresseService.modifier(id,adresse);
    }
    @DeleteMapping("/delete")
    public String delete(@PathVariable Long id){
        return adresseService.supprimer(id);
    }
}
