package com.ait.test.ppob.gateway.service.processor;

import com.ait.test.ppob.gateway.constant.StatusEnum;
import com.ait.test.ppob.gateway.jpa.entity.Client;
import com.ait.test.ppob.gateway.jpa.entity.TransactionData;
import com.ait.test.ppob.gateway.model.request.ClientRequest;

import java.util.Optional;

public interface TransactionService {
    Optional<TransactionData> writeTransaction(ClientRequest clientRequest, StatusEnum transactionStatus);
    Optional<TransactionData> updateTransaction(Client client,String referenceNumber, StatusEnum transactionStatus);
}
