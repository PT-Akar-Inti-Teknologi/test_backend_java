package com.ait.test.ppob.gateway.service.processor;

import com.ait.test.ppob.gateway.model.data.AggregatorRequest;
import com.ait.test.ppob.gateway.model.data.AggregatorResponse;

import java.util.Optional;

public interface AggregatorCall {
    Optional<AggregatorResponse> call(AggregatorRequest aggregatorRequest);
}
