package com.ghub.ivmagl.components;

public class Car {
    private Wheel wheels;
    private Engine engine;

    public Car() {

    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setWheels(Wheel wheels) {
        this.wheels = wheels;
    }

    public Wheel getWheels() {
        return wheels;
    }

}
