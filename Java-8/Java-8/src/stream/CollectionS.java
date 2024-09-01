package stream;

import java.util.ArrayList;
import java.util.List;

public class CollectionS {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("E");
        list.add("F");
        list.add("B");
        list.add("C");
        list.add(null);

        list.stream()
                .filter((p)->p!=null)
                .distinct()
                .map((s)->s.toUpperCase())
                .sorted()
                .forEach((s -> System.out.println(s)));

        System.out.println("-----------------------------------");

        list.stream()
                .limit(5)
                .skip(2)
                .forEach((s)->System.out.println(s));

        System.out.println("-----------------------------------");


    }

}
