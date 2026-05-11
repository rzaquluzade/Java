package Practic02.Task8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Ali");
        names.add("Veli");
        names.add("Aysel");
        names.add("Orxan");
        names.add("Rwsul");
        names.add("Zumrud");

        List <String> longString = names.stream()
                .max(Comparator.comparingInt(String::length))
                .stream()
                .toList();

        longString.forEach(System.out::println);

    }
}
