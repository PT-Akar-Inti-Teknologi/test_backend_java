package com.ait.test.ppob.gateway.service.main;

import com.ait.test.ppob.gateway.model.request.ClientRequest;
import com.ait.test.ppob.gateway.model.response.PaymentResponse;
import com.ait.test.ppob.gateway.model.response.ResponseTemplate;
import org.springframework.http.ResponseEntity;

public interface GatewayService {
    ResponseEntity<ResponseTemplate<PaymentResponse>> payment(ClientRequest clientRequest);
}
