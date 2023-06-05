package com.example.junit_05062023.modelo;

public class Rectangulo implements IFigura {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcArea(){
        if ((base < 0 && altura > 0) || (base > 0 && altura < 0)) throw new ArithmeticException("No puede ser un area negativa");
        return base*altura;
    }
}
