package com.ghub.ivmagl.components;

import org.springframework.beans.factory.annotation.Value;

public class Tyres {
    @Value("${tyresSize}")
    private int size;
    @Value("${tyresName}")
    private String name;

    public Tyres(){

    }

    public void setSize(int size) {
       this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
