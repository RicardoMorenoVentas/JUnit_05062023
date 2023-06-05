package com.example.junit_05062023.modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test
    void sumar() {
        Calculadora calc = new Calculadora();
        assertEquals(3, calc.sumar(1,2));
    }

    @Test
    void restar() {
        Calculadora calc = new Calculadora();
        assertEquals(0,calc.restar(5,5));
        assertEquals(8,calc.restar(10,2));
        assertEquals(22,calc.restar(10,-12));
    }

    @Test
    void multiplicar() {
        Calculadora calc = new Calculadora();
        assertEquals(10,calc.multiplicar(5,2));
        assertEquals(-20,calc.multiplicar(10,-2));
        assertEquals(0,calc.multiplicar(10,0));
    }

    @Test
    void dividir() {
        Calculadora calc = new Calculadora();
        assertEquals(5,calc.dividir(10,2));
        assertThrows(ArithmeticException.class,() -> calc.dividir(10,0));
        assertEquals(-2.5,calc.dividir(10,-4));
    }
}