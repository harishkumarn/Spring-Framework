
package com.mvc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/name")
    public String show_hello(){
        
        return "hello world";
    }
    
}
