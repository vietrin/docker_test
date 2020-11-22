package com.example.demoheroku;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Id;

@javax.persistence.Entity
@Getter
@Setter
public class Entity {
    @Id
    private Integer id;
    private String name;
}
