
package com.mvc.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import java.util.ArrayList;

@RestController
public class HelloController {


    List<String> names = new ArrayList<String>();

    @GetMapping("/name")
    public ResponseEntity<String> show_hello(){
        return new ResponseEntity<>( "hello world ",HttpStatus.OK);
    }

    @GetMapping("/names")
    public List<String> getNames(){
       return names;
    }

    @GetMapping("/greet/{name}")
    public ResponseEntity<String>  greet(@PathVariable String name){
        return new ResponseEntity<>( "hello "+name,HttpStatus.OK);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<String> get(@PathVariable int id){
        return new ResponseEntity<>(names.get(id),HttpStatus.OK);

    }


    // other annotations

    @PostConstruct
    public void init(){
        names.add("harish");
        names.add("kumar");
        names.add("dilip");
        names.add("nattu");
    }

    @PreDestroy
    public void destroy(){
        names.clear();
    }

}
