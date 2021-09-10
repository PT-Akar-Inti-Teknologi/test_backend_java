package com.ait.test.ppob.gateway.configuration;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Getter
public class AggregatorComponent {
    @Value("${aggregator.baseUrl}")
    private String baseUrl;
}
