package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculateAreaTest2 {

    CalculateArea calculateArea = new CalculateArea();

    @Test
    void areaOfSquare() {
        assertNotEquals(577,calculateArea.areaOfSquare(24));
    }

    @Test
    void areaOfCircle() {
        assertNotEquals(75,calculateArea.areaOfCircle(2));
    }

    @Test
    void areaOfCircleWithSupplier(){ //lazy valuation
        assertNotEquals(57,calculateArea.areaOfCircle(2),()->"Message to dev if test case failed..");
    }
}