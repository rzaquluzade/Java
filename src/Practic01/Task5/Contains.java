package Practic01.Task5;

import java.util.List;

public class Contains {

    public static <T> boolean contains (List<T> list, T element) {
        if (list.contains(element)) {
            return true;
        } else {
            return false;
        }
    }
}
