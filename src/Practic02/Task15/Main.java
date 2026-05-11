package Practic02.Task15;

import java.util.List;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        List <Integer> numbers = IntStream.range(1, 11)
                .boxed()
                .toList();

        int total = numbers.stream()
                .reduce(1, (a, b) -> a * b);

        System.out.println("Total : " + total);
    }
}
