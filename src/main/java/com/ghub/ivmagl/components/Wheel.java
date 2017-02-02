package com.ghub.ivmagl.components;

public class Wheel {
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
