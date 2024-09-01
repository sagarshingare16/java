package stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.OptionalDouble;
import java.util.Set;

public class Client {
    public static void main(String[] args) {
        int[] arr = {1,6,8,6,74};
        Arrays.stream(arr).forEach((i)->System.out.println(i));

        Arrays.stream(arr).sorted().forEach((i)->System.out.println(i));

        Arrays.stream(arr).distinct().sorted().forEach((i)->System.out.println(i));

        Arrays.stream(arr).sum();

        OptionalDouble average = Arrays.stream(arr).average();

        Set<Integer> set = new HashSet<>();
        Arrays.stream(arr)
                .filter((i)-> i%2 == 0)
                .forEach((s)->set.add(s));
        System.out.println(set);

        int min = Arrays.stream(arr).min().getAsInt();
        int max = Arrays.stream(arr).max().getAsInt();

    }
}
