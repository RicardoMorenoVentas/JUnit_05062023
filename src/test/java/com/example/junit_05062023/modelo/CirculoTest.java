package com.example.junit_05062023.modelo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CirculoTest {

    @Test
    void calcArea() {
        Circulo c = new Circulo(3.4);
        assertTrue(c.calcArea() == (3.4*3.4)*Math.PI);
        c.setRadio(0);
        assertTrue(c.calcArea() == 0);
        c.setRadio(-1);
        assertTrue(c.calcArea() == Math.PI );
    }

    @Test
    void getRadio() {
        Circulo c = new Circulo(3);
        assertTrue(c.getRadio() == 3);
    }

    @Test
    void setRadio() {
        Circulo c = new Circulo(3);
        c.setRadio(4);
        assertTrue(c.getRadio() == 4);
    }
}