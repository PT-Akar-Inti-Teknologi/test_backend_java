package com.ait.test.ppob.gateway.jpa.repository;

import com.ait.test.ppob.gateway.jpa.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client,String> {
}
