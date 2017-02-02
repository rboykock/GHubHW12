package com.ghub.ivmagl.components;

import org.springframework.beans.factory.annotation.Value;

public class Engine {
//    @Value("${engineCapacity}")
    private double engineCapacity;

    public Engine() {

    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void init() {
        engineCapacity = 3.0;
    }
}
