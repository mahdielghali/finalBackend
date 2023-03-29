package com.bezkoder.spring.login.service;

import com.bezkoder.spring.login.models.Client;
import com.bezkoder.spring.login.repository.ClientRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor

public class ClientServiceImpl implements ClientService {
    private final ClientRepository clientRepository;
    @Override
    public Client creer(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public List<Client> lire() {
        return clientRepository.findAll();
    }

    @Override
    public Client modifier(Long id, Client client) {
        return clientRepository.findById(id)
                .map(c->{
                    c.setNom(client.getNom());
                    c.setType(client.getType());
                    c.setEmail(client.getEmail());
                    c.setEntreprise(client.getEntreprise());
                    c.setDate_naissance(client.getDate_naissance());
                    c.setNum_telephone(client.getNum_telephone());
                    c.setCommentaire(client.getCommentaire());
                    return clientRepository.save(c);
                }).orElseThrow(()-> new RuntimeException("Client non trouvé!"));
    }

    @Override
    public String supprimer(Long id) {
        clientRepository.deleteById(id);
        return "Client supprimé!";
    }

}
