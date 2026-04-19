package L09.oop.inheritance.objectclass.Task08MediumHashSetUniqueness;

import java.util.HashSet;
import java.util.SortedMap;

import L09.oop.inheritance.objectclass.Task07MediumEqualsHashCode.Product;

public class Main {

    public static void main(String[] args) {

        HashSet<Product> set = new HashSet<>();

        set.add(new Product(1, "Name1", 1000));
        set.add(new Product(2, "Name2", 6500));
        set.add(new Product(1, "Name", 2500));

        System.out.println("Set size : " + set.size());

        for (Product p : set) {
            System.out.println(p);
        }
    }
}
