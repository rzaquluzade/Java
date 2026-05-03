package Practic01.Task6;

import java.util.ArrayList;
import java.util.List;

public class Storage <T> {

    List <T> list = new ArrayList<>();

    public void add (T item) {
        list.add(item);
    }

    public void getAll () {
        for (T t : list) {
            System.out.println(t);
        }
    }
}
