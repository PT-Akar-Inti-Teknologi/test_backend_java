package com.ait.test.ppob.aggregator.service.main.impl;

import com.ait.test.ppob.aggregator.model.request.ProcessRequest;
import com.ait.test.ppob.aggregator.model.response.ProcessResponse;
import com.ait.test.ppob.aggregator.model.response.ResponseTemplate;
import com.ait.test.ppob.aggregator.service.main.AggregatorService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class AggregatorServiceImpl implements AggregatorService {
    @Override
    public ResponseEntity<ResponseTemplate<ProcessResponse>> process(ProcessRequest processRequest) {
        return null;
    }
}
