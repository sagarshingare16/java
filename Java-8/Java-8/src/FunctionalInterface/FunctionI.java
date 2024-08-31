package FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionI implements Function<Integer,Integer> {
    @Override
    public Integer apply(Integer i) {
        return i+1;
    }
    public static void main(String[] args) {
        Function<Integer,Integer> function = new FunctionI();
        Integer result = function.apply(5);
        System.out.println(result);

        Function<String,Integer> stringLengthFunc = (String s)->{
            return s.length();
        };

        String s = "Hello and Welcome..";
        Integer length = stringLengthFunc.apply(s);
        System.out.println(length);

        List<String> stringList = Arrays.asList("Hello","Welcome","Good Morning","Good Night");
        stringList.stream().map((s1)->{
           return s1.concat(" John");
        }).forEach((t)-> {
            System.out.println(t);
        });
    }
}
