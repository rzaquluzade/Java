package Practic01.Task5;

import java.util.ArrayList;
import java.util.List;

import static Practic01.Task5.Contains.contains;

public class Main {

    public static void main(String[] args) {

        List <Character> list = new ArrayList<>();

        list.add('A');
        list.add('5');

        boolean x = contains(list, '5');

        System.out.println(x);
    }
}
