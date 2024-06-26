package org.example.performance;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class SortingArrayTest {
    SortingArray sortingArray = new SortingArray();

    @Test
    void sortingArray() {
        int[] unsorted = {2,5,1};
        assertTimeout(Duration.ofMillis(1),()-> sortingArray.sortingArray(unsorted));
    }
}