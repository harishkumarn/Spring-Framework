package com.example.controller;

import java.util.Locale;

import javax.validation.Valid;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.example.database.UserDB;
import com.example.database.UserException;
import com.pojo.User;
import com.example.GlobalUtilities;

@RestController
public class HelloController {
   
    @Autowired
    GlobalUtilities util;

    @Autowired
    @Qualifier("userDb")
    UserDB db ;

    @RequestMapping(method = RequestMethod.GET,value="/")
    String hello() {
        return "Hello World!";
    }

    @RequestMapping(method = RequestMethod.GET, value="/get/{id}")
    ResponseEntity<User> getUser(@PathVariable Integer id) throws UserException{
        try{
            return new ResponseEntity<User>(db.getUserById(id),HttpStatus.ACCEPTED);
        }catch(UserException ue){
            throw ue;
        }catch(Exception e){
            throw e;
        }
    }

    @RequestMapping(method = RequestMethod.POST, value="/create", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<JSONObject> createUser(@Valid @RequestBody User user) throws UserException{
        db.createUser(user);
        return new ResponseEntity<JSONObject>(new JSONObject()
                                        .put("status","success")
                                        .put("message",util.getLocalizedError("response.create.success"))
                                    ,HttpStatus.CREATED);
    }

    

}
