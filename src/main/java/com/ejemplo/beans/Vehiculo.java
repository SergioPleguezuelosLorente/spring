package com.ejemplo.beans;

import org.springframework.stereotype.Component;

@Component
public class Vehiculo {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
