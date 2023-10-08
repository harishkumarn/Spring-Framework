package com.example.handler;

import org.json.JSONObject;
public class ErrorCapsule {
    String message;
    JSONObject details;

    public ErrorCapsule(String mes){
        this.message = mes;
    }

    public String getMessage(){
        return message;
    }

    public JSONObject getDetails(){
        return details;
    }
}
