package com.example.junit_05062023.modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test
    void sumar() {
        Calculadora calc = new Calculadora();
        assertTrue(calc.sumar(1,2) == 3);
    }

    @Test
    void restar() {
        Calculadora calc = new Calculadora();
        assertTrue(calc.restar(5,5) == 0);
        assertTrue(calc.restar(10,2) == 8);
        assertTrue(calc.restar(10,-12) == 22);
    }

    @Test
    void multiplicar() {
        Calculadora calc = new Calculadora();
        assertTrue(calc.multiplicar(5,2) == 10);
        assertTrue(calc.multiplicar(10,-2) == -20);
        assertTrue(calc.multiplicar(10,0) == 0);
    }

    @Test
    void dividir() {
        Calculadora calc = new Calculadora();
        assertTrue(calc.dividir(10,2) == 5);
        assertThrows(ArithmeticException.class,() -> calc.dividir(10,0));
        assertTrue(calc.dividir(10,-4) == -2.5);
    }
}