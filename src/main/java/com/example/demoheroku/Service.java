package com.example.demoheroku;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class Service {
    @Autowired
    private Repo repo;

    public List<Entity> findAll(){
        return repo.findAll();
    }
}
