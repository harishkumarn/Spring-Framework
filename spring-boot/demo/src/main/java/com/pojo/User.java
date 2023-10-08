package com.pojo;

import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonCreator;

import javax.validation.constraints.Min;

public class User {
    
     @Min(value=1, message="id can't be lesser than 1")
     Integer id;
     
     @Size(min = 2,  message="name has to be atleast 2 letters" )
     String name;

     @Min(value=1, message="age can't be lesser than 1")
     Integer age;

    
    public User(Integer id, String name, Integer age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public User(){}
 
    public Integer getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public Integer getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(Integer age){
        this.age = age;
    }

    public void setId(Integer id){
        this.id = id;
    }
    
}
