package com.mvc.server;
import org.springframework.boot.SpringApplication;  
import org.springframework.boot.autoconfigure.SpringBootApplication;  
import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication  
@ComponentScan(basePackages={"com.mvc.controller"})
public class SpringBootServer  {
    
    public static void main(String[] args)   
    {  
        SpringApplication.run(SpringBootServer.class, args);  
    }  

    public CommandLineRunner commandLineRunner(){
        return args -> {
            System.out.println("App started");
        };
    }
}
