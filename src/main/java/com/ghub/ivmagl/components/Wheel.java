package com.ghub.ivmagl.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Wheel {
    @Autowired
    private Tyres tyres;

    public  Wheel() {

    }

    public Wheel(Tyres tyres) {
        this.tyres = tyres;
    }
    public void setTyres(Tyres tyres) {
        this.tyres = tyres;
    }

    public Tyres getTyres() {
        return tyres;
    }
}
