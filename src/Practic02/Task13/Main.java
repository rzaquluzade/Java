package Practic02.Task13;

import java.util.Comparator;
import java.util.List;
import java.util.SortedMap;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        List <Integer> numbers = IntStream.range(0, 21)
                .boxed()
                .toList();

        String merge = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .map(String::valueOf)
                .collect(Collectors.joining(", "));

        System.out.println(merge);
    }
}
