package Practic01.Task3;

import java.util.List;
import java.util.NoSuchElementException;

public class FirstElement {

    public static  <T> T getFirst (List <T> list) {
       if (list.isEmpty()) {
           throw new NoSuchElementException("The list is empty!");
       }
       return list.get(0);
    }
}
