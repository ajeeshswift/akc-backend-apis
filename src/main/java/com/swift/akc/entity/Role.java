package com.swift.akc.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class Role implements Serializable  {

    public static final String ROLE_ADMIN = "ROLE_ADMIN";

    private String name;


    public Role(String name) {
        this.name = name;
    }
}
