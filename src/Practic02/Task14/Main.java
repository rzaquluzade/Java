package Practic02.Task14;

import java.util.List;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        List <Integer> numbers = IntStream.range(0, 21)
                .boxed()
                .toList();

        long min = numbers.stream()
                .min(Integer::compareTo)
                .orElseThrow();

        System.out.println("Minimum value : " + min);

    }
}
