package stream;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CollectionM {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"John");
        map.put(2,"Mark");
        map.put(3,"Jorge");
        map.put(4,"Naveen");

        map.keySet().stream()
                .forEach((s)->System.out.println(s));

        map.values().stream()
                .forEach((s -> System.out.println(s)));

        map.entrySet().stream()
                .forEach((k)->System.out.println(k));

        map.entrySet().stream()
                .sorted(Map.Entry.comparingByKey(((o1, o2) -> o2.compareTo(o1))))
                .forEach((s)->System.out.println(s));


        List<String> values = map.values().stream()
                                 .collect(Collectors.toList());


    }


}
