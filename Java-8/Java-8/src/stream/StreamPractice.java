package stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPractice {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10,1,6,2);

        List<Double> doubleList = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0,1.0,6.0,2.0);

        String input = "Hello World";

        integerList.stream()
                .filter(i -> i%2==0)
                .forEach(System.out::println);

        integerList.stream()
                .map((i)->i+2)
                .forEach(System.out::println);

        Optional<Integer> sum = integerList.stream()
                .map((i)->i+2)
                .filter(i->i%2==0)
                .reduce(Integer::sum);

        List<Integer> evenList = integerList.stream()
                .filter(i->i%2==0)
                .toList();

        List<Integer> oddList = integerList.stream()
                .filter(i->i%2!=0)
                .toList();

        integerList.stream()
                .distinct()
                .forEach(System.out::print);

        doubleList.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

        List<String> strings = Arrays.asList("apple", "banana", "cherry");
        String result = strings.stream()
                .collect(Collectors.joining(",","[","]"));
        System.out.println(result);

        List<Integer> integerList1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10,1,6,2);
        integerList1.stream()
                .filter(i->i%5==0)
                .forEach(System.out::println);

        List<Integer> integerList2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10,1,6,2);
        Optional<Integer> max = integerList2.stream().max(Comparator.naturalOrder());
        Optional<Integer> min = integerList2.stream().min(Comparator.naturalOrder());


        Integer[] array1 = {5, 2, 8, 1, 3};
        Integer[] array2 = {7, 2, 6, 5, 4};

        List<Integer> mergeArray = Arrays.asList(Stream.concat(Arrays.stream(array1), Arrays.stream(array2))
                .distinct()
                .sorted()
                .toArray(Integer[]::new));
        System.out.println(mergeArray);

        //Check if two strings are anagrams or not using Java 8 streams
        String str1 = "listen";
        String str2 = "silent";
        boolean isAnagram = str1.chars().distinct().count() == str2.chars().distinct().count();
        System.out.println(isAnagram);

        //Find the sum of elements in a list using Java 8 streams
        List<Integer> integerList3 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10,1,6,2);
        int sum1 = integerList3.stream()
                .mapToInt(i->i)
                .sum();
        System.out.println(sum1);

        //Find the average of elements in a list using Java 8 streams
        double average = integerList3.stream()
                .mapToInt(i->i)
                .average()
                .getAsDouble();
        System.out.println(average);

        //Find the maximum element in a list using Java 8 streams
        int max1 = integerList3.stream()
                .mapToInt(i->i)
                .max()
                .getAsInt();
        System.out.println(max1);

        //Find the minimum element in a list using Java 8 streams
        int min1 = integerList3.stream()
                .mapToInt(i->i)
                .min()
                .getAsInt();
        System.out.println(min1);

        //Find the distinct elements in a list using Java 8 streams
        List<Integer> distinctList = integerList3.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(distinctList);

        //Find maximum from an array using Java 8 streams
        int[] intArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        OptionalInt maxInteger = Arrays.stream(intArr)
                                       .max();
        System.out.println(maxInteger.getAsInt());

        //Find the second-largest number in an integer array using Java 8 streams
        int[] intArr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Arrays.sort(intArr1);
        System.out.println(intArr1[intArr1.length-2]);

        //Sort a list of strings according to the increasing order of their lengths using Java 8 streams
        List<String> names = Arrays.asList("John", "Jayne", "JonathonSmith", "Jay", "Jl");
        names.stream()
                .sorted(Comparator.comparing(String::length))
                .forEach(System.out::println);

        //Sort a list of strings according to the decreasing order of their lengths using Java 8 streams
        names.stream()
                .sorted(Comparator.comparing(String::length).reversed())
                .forEach(System.out::println);

        //Find the common elements between two arrays using Java 8 streams
        Integer[] arr1 = {5, 2, 8, 9, 7, 3};
        Integer[] arr2 = {4, 2, 8, 6, 7, 1};
        Set<Integer> integerSet = new HashSet<>(Arrays.asList(arr1));
        Arrays.stream(arr2)
                .filter(a->integerSet.contains(a))
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        //Reverse each word of a string using Java 8 streams
        String inputString1 = "Welcome";
        char[] charArray = inputString1.toCharArray();
        String reversedString = "";
        for(int i=charArray.length-1;i>=0;i--){
            reversedString += charArray[i];
        }
        System.out.println(reversedString);

        //Count the number of vowels in a string using Java 8 streams
        String inputString = "Welcome";
        long vowelCount = inputString.chars()
                .filter(c->c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
                .count();
        System.out.println(vowelCount);



    }
}
