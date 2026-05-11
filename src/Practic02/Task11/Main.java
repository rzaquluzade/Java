package Practic02.Task11;

import java.util.List;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        List <Integer> numbers = IntStream.range(0, 20)
                .boxed()
                .toList();

        numbers.stream()
                .filter(n -> n > 10 && n < 15)
                .forEach(System.out::println);

    }
}
