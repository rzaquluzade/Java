package Practic02.Task1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List <String> names = new ArrayList<>();
        names.add("Ali");
        names.add("Veli");
        names.add("Aysel");
        names.add("Orxan");

        names.stream()
                .forEach(System.out::println);
    }
}
