package methodRef;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice","Bob","Mark","John");

        List<Student> studentList = names.stream()
               // .map((x)->new Student(x))              // constructor ref
                .map(Student::new)
                .collect(Collectors.toList());
        System.out.println(studentList);
    }
}
