package Practic01.Task3;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import static Practic01.Task3.FirstElement.getFirst;

public class Main {

    public static void main(String[] args) {

        List <Integer> list = new ArrayList<>();

//        list.add(5);

        try {
            int value = getFirst(list);
            System.out.println(value);
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
        }
    }
}
