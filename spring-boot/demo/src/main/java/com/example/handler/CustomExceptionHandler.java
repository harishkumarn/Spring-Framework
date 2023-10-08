package com.example.handler;


import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;

import org.json.JSONArray;

import com.example.GlobalUtilities;
import com.example.database.UserException;
@ControllerAdvice
public class CustomExceptionHandler {

    @Autowired
    GlobalUtilities util;

    @ExceptionHandler(UserException.class)
    public ResponseEntity<ErrorCapsule> handleUserNotFound(UserException ex){
        return new ResponseEntity<ErrorCapsule>(new ErrorCapsule(ex.getMessage()), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorCapsule> invalidPayload(MethodArgumentNotValidException ex){
        BindingResult bindingResult = ex.getBindingResult();
        List<FieldError> fieldErrors = bindingResult.getFieldErrors();
        JSONArray errorMessages = new JSONArray();

        for (FieldError fieldError : fieldErrors) {
            errorMessages.put(util.getLocalizedError(fieldError.getDefaultMessage()));
        }
        return new ResponseEntity<ErrorCapsule>(new ErrorCapsule("Error",errorMessages), HttpStatus.BAD_REQUEST);
    }
}
