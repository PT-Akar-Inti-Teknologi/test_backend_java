package com.ait.test.ppob.gateway.model.response;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ResponseTemplate<T> {

    @JsonIgnore
    private HttpStatus httpStatus;

    @JsonProperty("response_code")
    private String responseCode;

    @JsonProperty("response_text")
    private String responseText;

    @JsonProperty("data")
    private T data;
}
