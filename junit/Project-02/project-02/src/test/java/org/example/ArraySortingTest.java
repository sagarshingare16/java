package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArraySortingTest {

    ArraySorting sorting =  new ArraySorting();

    @Test
    void sortArray() {

        /*try {
            int[] unsortedArray = {2, 1, 4};
            int[] sortedArray = sorting.sortArray(unsortedArray);
            for (int arr : sortedArray) {
                System.out.print(arr + " ");
            }
        }catch (NullPointerException ex){
            System.out.println("Exception generated..");
        }*/

        int[] unsorted = null;//{4,1,58,2,3};
        assertThrows(NullPointerException.class, ()->sorting.sortArray(unsorted));
    }
}