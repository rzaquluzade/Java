package Practic02.Task9;

import java.util.List;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        List<Integer> numbers = IntStream.range(0,20)
                .boxed()
                .toList();

        long count = numbers.stream()
                .filter(n -> n % 2 == 0)
                .count();

        System.out.println("Count of even numbers : " + count);
        
    }
}
