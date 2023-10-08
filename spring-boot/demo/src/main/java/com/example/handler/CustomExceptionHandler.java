package com.example.handler;


import org.springframework.web.bind.annotation.ExceptionHandler;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.example.database.UserException;
@ControllerAdvice
public class CustomExceptionHandler {
    @ExceptionHandler(UserException.class)
    public ResponseEntity<ErrorCapsule> handleUserNotFound(UserException ex){
        return new ResponseEntity<ErrorCapsule>(new ErrorCapsule(ex.getMessage()), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorCapsule> invalidPayload(MethodArgumentNotValidException ex){
        return new ResponseEntity<ErrorCapsule>(new ErrorCapsule(ex.getLocalizedMessage()), HttpStatus.BAD_REQUEST);
    }
}
