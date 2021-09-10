package com.ait.test.ppob.aggregator.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ResponseTemplate<T> {
    @JsonProperty("response_code")
    private String responseCode;

    @JsonProperty("response_text")
    private String responseText;

    @JsonProperty("data")
    private T data;
}
