package com.bezkoder.spring.login.repository;

import com.bezkoder.spring.login.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
