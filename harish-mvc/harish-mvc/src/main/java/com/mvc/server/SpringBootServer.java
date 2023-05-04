package com.mvc.server;
import org.springframework.boot.SpringApplication;  
import org.springframework.boot.autoconfigure.SpringBootApplication;  
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication  
@ComponentScan(basePackages={"com.mvc.controller"})
public class SpringBootServer  {
    public static void main(String[] args)   
    {  
        SpringApplication.run(SpringBootServer.class, args);  
    }  
}
