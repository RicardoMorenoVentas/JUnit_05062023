package com.example.junit_05062023.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;

public class Circulo implements IFigura {
    private double radio;

    public Circulo(double radio){
        this.radio=radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcArea(){
        return Math.PI*(radio*radio);
    }
}
