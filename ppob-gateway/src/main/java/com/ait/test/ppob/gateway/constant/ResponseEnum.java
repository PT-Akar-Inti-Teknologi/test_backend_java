package com.ait.test.ppob.gateway.constant;

import com.ait.test.ppob.gateway.model.response.ResponseTemplate;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public enum ResponseEnum {
    SUCCESS("000000","Success", HttpStatus.OK),

    INTERNAL_SERVER_ERROR("999999","Internal Server Error",HttpStatus.INTERNAL_SERVER_ERROR),
    ;
    private String responseCode;
    private String responseText;
    private HttpStatus httpStatus;

    ResponseEnum(String responseCode, String responseText, HttpStatus httpStatus) {
        this.responseCode = responseCode;
        this.responseText = responseText;
        this.httpStatus = httpStatus;
    }

    public ResponseTemplate createResponse(){
        return new ResponseTemplate(this.httpStatus,this.responseCode,this.responseText,null);
    }

    public ResponseTemplate createResponse(Object data){
        return new ResponseTemplate(this.httpStatus,this.responseCode,this.responseText,data);
    }
}
