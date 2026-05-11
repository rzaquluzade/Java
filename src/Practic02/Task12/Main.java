package Practic02.Task12;

import java.util.List;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        List <Integer> numbers = IntStream.range(0, 10)
                .boxed()
                .toList();

        List <Integer> newNumbers = numbers.stream()
                .map(n -> n * 2)
                .toList();

        System.out.println("Old Numbers : " + numbers + "\nNew Number : " + newNumbers);
    }
}
