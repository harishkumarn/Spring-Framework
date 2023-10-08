package com.mvc.db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
public class Repo {
    

    EntityManager entityManager;

    @Autowired
    public Repo(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    @Transactional
    public void save(Employee employee){
        entityManager.persist(employee);
    }
}
