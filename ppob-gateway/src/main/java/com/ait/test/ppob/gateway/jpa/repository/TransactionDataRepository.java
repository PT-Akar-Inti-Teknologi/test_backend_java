package com.ait.test.ppob.gateway.jpa.repository;

import com.ait.test.ppob.gateway.jpa.entity.TransactionData;
import com.ait.test.ppob.gateway.jpa.entity.composite.TransactionKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionDataRepository extends JpaRepository<TransactionData, TransactionKey> {
}
