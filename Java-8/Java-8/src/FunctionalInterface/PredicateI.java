package FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateI implements Predicate<Integer> {
    @Override
    public boolean test(Integer integer) {
        if(integer%2 == 0)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Predicate<Integer> predicate = new PredicateI();
        System.out.println(predicate.test(5));

        Predicate<Integer> predicate1 = (t) ->{
            return t % 2 == 0;
        };
        System.out.println(predicate1.test(4));

        List<Integer> list = Arrays.asList(1,2,5,-1,6);
        list.stream().filter((t)->{
            return t%2==0;
        }).forEach(t -> {
            System.out.println(t);
        });
    }
}
