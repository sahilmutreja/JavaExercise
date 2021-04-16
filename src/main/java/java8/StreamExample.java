package java8;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamExample {

    public static void main(String[] args) {

        /*forEach, limit and sorted*/
        Random random = new Random();
        IntStream randNumbers = random.ints().limit(10).sorted();
        randNumbers.forEach(System.out::println);

        /*map*/
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        //get list of unique squares
        List<Integer> squaresList = numbers.stream().map(i -> i * i).distinct().collect(Collectors.toList());
        squaresList.forEach(System.out::println);

        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");

        /*Collectors*/
        String mergedString = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(", "));
        System.out.println("Merged String: " + mergedString);

        /*filter*/
        //get count of empty string
        long count = strings.stream().filter(string -> string.isEmpty()).count();
        System.out.println("count = " + count);

        /*parallelStream*/
        //get count of empty string
        count = strings.parallelStream().filter(string -> string.isEmpty()).count();
        System.out.println("count = " + count);

        IntSummaryStatistics stats = numbers.stream().mapToInt((x) -> x).summaryStatistics();

        System.out.println("Highest number in List : " + stats.getMax());
        System.out.println("Lowest number in List : " + stats.getMin());
        System.out.println("Sum of all numbers : " + stats.getSum());
        System.out.println("Average of all numbers : " + stats.getAverage());

    }
}
