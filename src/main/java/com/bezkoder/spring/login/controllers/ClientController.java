package com.bezkoder.spring.login.controllers;

import com.bezkoder.spring.login.models.Client;
import com.bezkoder.spring.login.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/client")

public class ClientController {
    @Autowired

    private ClientService clientService;

    @PostMapping("/create")
    public Client create(@RequestBody Client client) {
        return clientService.creer(client);
    }

    @GetMapping("/read")
    public List<Client> read() {
        return clientService.lire();
    }

    @PutMapping("/update/{id}")
    public Client update(@PathVariable Long id, @RequestBody Client client) {
        return clientService.modifier(id, client);
    }

    @DeleteMapping("/delete/{id}")
    public String detete(@PathVariable Long id) {
        return clientService.supprimer(id);
    }
}
