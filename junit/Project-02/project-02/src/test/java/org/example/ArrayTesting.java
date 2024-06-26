package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ArrayTesting {

    @Test
    void testArray() {
        int[] expected = {2, 4, 6, 8};
        int[] actual = {4, 8, 6, 2};

        Arrays.sort(actual);

        assertArrayEquals(expected,actual);  // check order and data.
        //assertEquals(expected,actual); // false as ref are diff for expected and actual;
    }
}
