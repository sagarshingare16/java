package stream;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyCounter {
    public static void main(String[] args) {
        String input = "Hello World";

        HashMap<Character,Integer> characterFrequency = new LinkedHashMap<>();
        for(Character c: input.toCharArray()){
            if(characterFrequency.containsKey(c)){
                characterFrequency.put(c, characterFrequency.get(c)+1);
            }else {
                characterFrequency.put(c,1);
            }
        }
        characterFrequency.forEach((k,v)->System.out.println(k+ " "+ v));

        System.out.println("----------------------");

        Map<Character,Long> characterFrequency1 = input.chars()
                .filter(c->c!=' ')
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        characterFrequency1.forEach((k,v)->System.out.println(k+" "+v));
    }
}
