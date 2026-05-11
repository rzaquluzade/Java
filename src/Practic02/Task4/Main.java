package Practic02.Task4;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        List <Integer> list = List.of(1,2,3,4,5,6,7,8,9);

        List <Integer> listSquare = list.stream()
                .map(ls -> ls * ls)
                .toList();

        listSquare.forEach(System.out::println);
    }
}
