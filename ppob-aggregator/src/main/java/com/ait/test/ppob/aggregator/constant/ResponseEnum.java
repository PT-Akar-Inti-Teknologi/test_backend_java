package com.ait.test.ppob.aggregator.constant;

import com.ait.test.ppob.aggregator.model.response.ResponseTemplate;
import lombok.Getter;

@Getter
public enum ResponseEnum {
    SUCCESS("000000","Success"),

    INTERNAL_SERVER_ERROR("999999","Internal Server Error"),
    ;
    private String responseCode;
    private String responseText;

    ResponseEnum(String responseCode, String responseText) {
        this.responseCode = responseCode;
        this.responseText = responseText;
    }

    public ResponseTemplate createResponse(){
        return new ResponseTemplate(this.responseCode,this.responseText,null);
    }

    public ResponseTemplate createResponse(Object data){
        return new ResponseTemplate(this.responseCode,this.responseText,data);
    }
}
