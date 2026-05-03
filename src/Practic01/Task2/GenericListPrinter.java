package Practic01.Task2;

import java.util.List;

public class GenericListPrinter {

    public <T> void printList (List <T> list) {
        for (T t : list) {
            System.out.println(t);
        }
    }
}
