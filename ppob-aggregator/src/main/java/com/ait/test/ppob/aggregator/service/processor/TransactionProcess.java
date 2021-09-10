package com.ait.test.ppob.aggregator.service.processor;

import com.ait.test.ppob.aggregator.jpa.entity.TransactionData;

import java.util.Optional;

public interface TransactionProcess {
    Optional<TransactionData> saveTransaction();//parameter define yourself
}
