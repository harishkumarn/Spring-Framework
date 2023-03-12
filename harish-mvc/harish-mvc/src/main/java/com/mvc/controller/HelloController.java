
package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // Extends @Component
public class HelloController {

    @RequestMapping("/name")
    public String show_hello(){
        
        return "hello-mvc";
    }
    
}
