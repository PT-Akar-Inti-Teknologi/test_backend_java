package com.ait.test.ppob.gateway.service.processor.impl;

import com.ait.test.ppob.gateway.model.data.AggregatorRequest;
import com.ait.test.ppob.gateway.model.data.AggregatorResponse;
import com.ait.test.ppob.gateway.service.processor.AggregatorCall;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AggregatorCallImpl implements AggregatorCall {

/**
 * Using Spring WebClient
 * https://www.baeldung.com/spring-5-webclient
 **/

    @Override
    public Optional<AggregatorResponse> call(AggregatorRequest aggregatorRequest) {
        return Optional.empty();
    }
}
