package com.stvnreis.projeto1.demo.infra.http.responses;

public class PostResponse {
    private String message;

    public PostResponse(String message){
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}
