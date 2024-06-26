package com.example.testing.test;

import com.example.testing.java.ReverseString;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseStringMulTest {
    ReverseString reverseString = new ReverseString();

    @Test
    void testReverseString_OneWord() {
        assertEquals("avaJ",reverseString.reverseString("Java"));
    }

    @Test
    void testReverseString_MulWords(){
        assertEquals("!emocleW dna olleH",reverseString.reverseString("Hello and Welcome!"));
    }
}