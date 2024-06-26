package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculateAreaTest {

    CalculateArea calculateArea = new CalculateArea();

    @Test
    void areaOfSquare() {
        assertEquals(576,calculateArea.areaOfSquare(24));
    }

    @Test
    void areaOfCircle() {
        assertEquals(78.5,calculateArea.areaOfCircle(5),"Area of circle calculation is wrong..");
    }

    @Test
    void areaOfCircleWithSupplier(){
        assertEquals(78.5,calculateArea.areaOfCircle(5),()->"Area of circle calculation is wrong..");
    }
}