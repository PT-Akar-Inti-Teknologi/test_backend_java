package com.ait.test.ppob.gateway.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ClientRequest {

    @JsonProperty("product_id")
    private String productId;

    @JsonProperty("reference_number")
    private String referenceNumber;

    @JsonProperty("amount")
    private long amount;
}
