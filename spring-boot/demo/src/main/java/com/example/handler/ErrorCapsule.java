package com.example.handler;

import org.json.JSONArray;
public class ErrorCapsule {
    String message;
    JSONArray details;

    public ErrorCapsule(String mes){
        this(mes,new JSONArray());
    }

    public ErrorCapsule(String mes, JSONArray jarr){
        this.message = mes;
        this.details = jarr;
    }

    public String getMessage(){
        return message;
    }

    public JSONArray getDetails(){
        return details;
    }
}
