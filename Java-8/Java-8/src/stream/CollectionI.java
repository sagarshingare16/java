package stream;

import java.util.*;
import java.util.stream.Collectors;

public class CollectionI {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(45);
        list.add(2);
        list.add(12);
        list.add(-98);
        list.add(5);

        long counted = list.stream().count();

        Object[] objects = list.stream().toArray();
        for(Object o : objects){
            System.out.println(o);
        }

        Integer max = list.stream().max(((o1, o2) -> o1.compareTo(o2))).get();
        Integer min = list.stream().min(((o1, o2) -> o1.compareTo(o2))).get();
        System.out.println("Max: "+ max + " Min: "+ min);

        Set<Integer> integerSet = list.stream().distinct().collect(Collectors.toSet());
        System.out.println(integerSet);

        Map<Integer,Integer> map= list.stream().collect(Collectors.toMap(
                k->k,
                v->v*2
        ));
        System.out.println(map);

        System.out.println("----------------------------");

        long sum = list.stream()
                .reduce((a,b)->a+b).get();
        System.out.println(sum);



    }
}
