package Practic01.Task2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        GenericListPrinter box = new GenericListPrinter();

        List <String> list = new ArrayList<>();

        list.add("Ali");
        list.add("Veli");
        list.add("Mirze");

        box.printList(list);

    }
}
