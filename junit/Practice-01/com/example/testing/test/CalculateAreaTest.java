package com.example.testing.test;

import com.example.testing.java.CalculateArea;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculateAreaTest {

    CalculateArea area =  new CalculateArea();

    @Test
    void areaOfSquare() {
        assertEquals(576,area.areaOfSquare(24));
    }

    @Test
    void areaOfCircle(){
        assertEquals(78.5,area.areaOfCircle(5),"Calculation is wrong...");
    }
}