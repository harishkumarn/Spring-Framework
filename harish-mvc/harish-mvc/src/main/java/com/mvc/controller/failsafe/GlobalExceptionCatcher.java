package com.mvc.controller.failsafe;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

class ErrorResponse {
    private String message;
    private int status;

    public ErrorResponse(String message, int status){
        this.message = message;
        this.status = status;
    }

    public String getMessage(){
        return message;
    }

    public int getStatus(){
        return status;
    }
}

@ControllerAdvice
public class GlobalExceptionCatcher {
    @ExceptionHandler
    public ResponseEntity<ErrorResponse> handleException(Exception e){
        return new ResponseEntity<>(new ErrorResponse(e.getMessage(),400),HttpStatus.NOT_FOUND);
    }
}
