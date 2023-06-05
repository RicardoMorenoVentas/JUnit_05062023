package com.example.junit_05062023.modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectanguloTest {

    @Test
    void calcArea() {
        Rectangulo r = new Rectangulo(10,4);
        assertTrue(r.calcArea() == (10*4));
        r.setAltura(-1);
        r.setBase(10);
        assertThrows(ArithmeticException.class,() -> r.calcArea());
        r.setBase(-10);
        assertDoesNotThrow(() -> r.calcArea());
    }

    @Test
    void getBase() {
        Rectangulo r = new Rectangulo(3,4);
        assertTrue(r.getBase() == 3);
    }

    @Test
    void setBase() {
        Rectangulo r = new Rectangulo(3,4);
        r.setBase(4);
        assertTrue(r.getBase() == 4);
    }

    @Test
    void getAltura() {
        Rectangulo r = new Rectangulo(3,4);
        assertTrue(r.getAltura() == 4);
    }

    @Test
    void setAltura() {
        Rectangulo r = new Rectangulo(3,4);
        r.setAltura(5);
        assertTrue(r.getAltura() == 5);
    }
}