package com.bezkoder.spring.login.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
@Entity
@Table(name = "TRANSACTION")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Transaction {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id_Transaction;
    @Enumerated(EnumType.STRING)
    private TypeTransaction typeTransaction;
    @ManyToOne
    @JoinColumn(name = "id_Produit",referencedColumnName = "id_produit")
    @JsonIgnore
    private Produit produit ;


    @ManyToOne
    @JoinColumn(name = "id_Client",referencedColumnName = "id_client")
    @JsonIgnore
    private Client client;


    @ManyToOne
    @JoinColumn(name = "id_user",referencedColumnName = "id")
    @JsonIgnore
    private User user ;


}
