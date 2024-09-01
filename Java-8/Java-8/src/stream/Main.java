package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();
        List<String> uniqueList = new ArrayList<>();
        stringList.add("John");
        stringList.add("Mark");
        stringList.add("Hello");
        stringList.add("Kafka");
        stringList.add("Mathew");
        stringList.add("Hello");

        for(String s : stringList){
            if(!uniqueList.contains(s)){
                uniqueList.add(s);
            }
        }
        System.out.println(stringList);
        System.out.println(uniqueList);

        Stream<String> stringStream = stringList.stream().distinct();
        stringStream.forEach((System.out::println));
    }
}
