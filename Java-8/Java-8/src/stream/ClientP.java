package stream;

import java.util.Arrays;

public class ClientP {
    public static void main(String[] args) {

        int[] arr = {10,12,9,5,14,85};

        boolean flag = Arrays.stream(arr).isParallel();
        boolean parallel = Arrays.stream(arr).parallel().isParallel();


    }
}
