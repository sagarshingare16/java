package com.example.testing.test;

import com.example.testing.java.ReverseString;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseStringTestJunit5 {

    @Test
    void test(){
        ReverseString reverseString = new ReverseString();
        assertEquals("neilA",reverseString.reverseString("Alien"));
    }

}