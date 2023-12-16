package com.stvnreis.projeto1.demo.infra.http.responses;

import com.stvnreis.projeto1.demo.core.HttpMessage;

public class ErrorResponse extends HttpMessage {
    public ErrorResponse(String message){
        this.message = message;
    }
}
