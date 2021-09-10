package com.ait.test.ppob.aggregator.jpa.repository;

import com.ait.test.ppob.aggregator.jpa.entity.TransactionData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionDataRepository extends JpaRepository<TransactionData, Long> {
}
