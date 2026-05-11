package Practic02.Task5;

import java.util.ArrayList;
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

        names.stream()
                .sorted()
                .forEach(System.out::println);

    }
}
