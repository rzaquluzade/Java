package Practic01.Task1;

public class Main {

    public static void main(String[] args) {

        GenericBox<String> names = new GenericBox<>();

        names.setType("Ali");

        String s = names.getType();

        System.out.println(s);

    }
}
