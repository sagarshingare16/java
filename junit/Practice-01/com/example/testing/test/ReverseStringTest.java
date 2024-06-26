package com.example.testing.test;

import com.example.testing.java.ReverseString;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ReverseStringTest {

    @Test(timeout = 10)
    public void reverseString() {
        ReverseString reverseString = new ReverseString();
        assertEquals("avaJ",reverseString.reverseString("Java"));
    }
}