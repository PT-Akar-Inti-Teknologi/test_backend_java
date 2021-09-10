package com.ait.test.ppob.aggregator.controller;

import com.ait.test.ppob.aggregator.model.request.ProcessRequest;
import com.ait.test.ppob.aggregator.model.response.ProcessResponse;
import com.ait.test.ppob.aggregator.model.response.ResponseTemplate;
import com.ait.test.ppob.aggregator.service.main.AggregatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class AggregatorController{
    @Autowired
    AggregatorService aggregatorService;

    @PostMapping
    public ResponseEntity<ResponseTemplate<ProcessResponse>> process(ProcessRequest processRequest) {
        return aggregatorService.process(processRequest);
    }
}
