package com.ait.test.ppob.gateway.service.main.impl;

import com.ait.test.ppob.gateway.constant.ResponseEnum;
import com.ait.test.ppob.gateway.model.request.ClientRequest;
import com.ait.test.ppob.gateway.model.response.PaymentResponse;
import com.ait.test.ppob.gateway.model.response.ResponseTemplate;
import com.ait.test.ppob.gateway.service.main.GatewayService;
import com.ait.test.ppob.gateway.service.processor.TransactionService;
import com.ait.test.ppob.gateway.utils.ResponseEntityHelpers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import static com.ait.test.ppob.gateway.utils.ResponseEntityHelpers.*;

@Service
public class GatewayServiceImpl implements GatewayService {

    @Autowired
    TransactionService transactionService;

    @Override
    public ResponseEntity<ResponseTemplate<PaymentResponse>> payment(ClientRequest clientRequest) {
        return createResponseEntity(ResponseEnum.SUCCESS.createResponse(clientRequest));
    }
}
