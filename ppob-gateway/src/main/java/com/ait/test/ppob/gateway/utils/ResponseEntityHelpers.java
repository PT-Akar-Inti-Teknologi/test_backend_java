package com.ait.test.ppob.gateway.utils;

import com.ait.test.ppob.gateway.model.response.ResponseTemplate;
import org.springframework.http.ResponseEntity;

public class ResponseEntityHelpers {
    public static <T> ResponseEntity<ResponseTemplate<T>> createResponseEntity(ResponseTemplate<T> response){
        return ResponseEntity.status(response.getHttpStatus()).body(response);
    }
}
