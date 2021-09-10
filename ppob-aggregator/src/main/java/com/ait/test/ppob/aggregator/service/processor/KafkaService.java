package com.ait.test.ppob.aggregator.service.processor;

import com.ait.test.ppob.aggregator.model.data.KafkaData;

import java.util.Optional;

public interface KafkaService {
    void submitToKafka(KafkaData kafkaData);
}
