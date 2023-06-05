package com.example.junit_05062023.modelo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CirculoTest {

    @Test
    void calcArea() {
        Circulo c = new Circulo(3.4);
        assertEquals((3.4*3.4)*Math.PI,c.calcArea());
        c.setRadio(0);
        assertEquals(0,c.calcArea());
        c.setRadio(-1);
        assertEquals(Math.PI,c.calcArea());
    }

    @Test
    void getRadio() {
        Circulo c = new Circulo(3);
        assertEquals(3,c.getRadio());
    }

    @Test
    void setRadio() {
        Circulo c = new Circulo(3);
        c.setRadio(4);
        assertEquals(4,c.getRadio());
    }
}