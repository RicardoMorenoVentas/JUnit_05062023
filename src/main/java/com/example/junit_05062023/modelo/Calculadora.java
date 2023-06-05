package com.example.junit_05062023.modelo;

public class Calculadora {

    public double sumar(double primer, double segundo){
        return primer + segundo;
    }

    public double restar(double primer, double segundo){
        return primer - segundo;
    }

    public double multiplicar(double primer, double segundo){
        return primer * segundo;
    }

    public double dividir(double primer, double segundo){
        if (segundo == 0) throw new ArithmeticException("No puede dividir entre 0");
        return primer / segundo;
    }
}
