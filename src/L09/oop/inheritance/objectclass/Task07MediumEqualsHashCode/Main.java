package L09.oop.inheritance.objectclass.Task07MediumEqualsHashCode;

public class Main {

    public static void main(String[] args) {

        Product p1 = new Product(1, "Name1", 1500);
        Product p2 = new Product(1, "Name2", 500);

        System.out.println("P1 : " + p1);
        System.out.println("P2 : " + p2);

        System.out.println("\nEquals : " + p1.equals(p2));
        System.out.println("HashCode P1 : " + p1.hashCode());
        System.out.println("HashCode P2 : " + p2.hashCode());

    }
}
