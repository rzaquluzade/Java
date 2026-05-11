package Practic02.Task7;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Ali");
        names.add("");
        names.add("Aysel");
        names.add("Orxan");
        names.add("Rwsul");
        names.add("");

        List <String> noEmptyNames = names.stream()
                .filter(n -> !n.isEmpty())
                .toList();

        noEmptyNames.forEach(System.out::println);
    }
}
