package com.ait.test.ppob.aggregator.service.main;

import com.ait.test.ppob.aggregator.model.request.ProcessRequest;
import com.ait.test.ppob.aggregator.model.response.ProcessResponse;
import com.ait.test.ppob.aggregator.model.response.ResponseTemplate;
import org.springframework.http.ResponseEntity;

public interface AggregatorService {
    ResponseEntity<ResponseTemplate<ProcessResponse>> process(ProcessRequest processRequest);
}
