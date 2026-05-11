package Practic02.Task10;

import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List <String> combine = List.of("a", "b", "c");

        String result = combine.stream()
                .collect(Collectors.joining(", "));

        System.out.println("Result : " + result);

    }
}
