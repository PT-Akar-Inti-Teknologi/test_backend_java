package com.ait.test.ppob.gateway.controller;

import com.ait.test.ppob.gateway.model.request.ClientRequest;
import com.ait.test.ppob.gateway.model.response.PaymentResponse;
import com.ait.test.ppob.gateway.model.response.ResponseTemplate;
import com.ait.test.ppob.gateway.service.main.GatewayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class GatewayController {
    @Autowired
    GatewayService gatewayService;

    @PostMapping
    public ResponseEntity<ResponseTemplate<PaymentResponse>> payment(@RequestBody ClientRequest clientRequest) {
        return gatewayService.payment(clientRequest);
    }
}
