package methodRef;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void print(String s){
        System.out.println(s);
    }

    public static void main(String[] args) {
        List<String> studentList = Arrays.asList("Alice","Bob","Mark","John");
        studentList.forEach(Main::print);
    }
}
