package com.mvc.db;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class Skills {
    
    public enum Type{

        Dev("Dev"), QA("QA"), BA("BA"), DevOps("DevOps"), Manager("Manager");
        private Type(String name){
            this.name = name;
        }

        String name;
    }

    @Column(name="type")
    Type type;

    @Column(name="specaiality")
    String speciality;

}
