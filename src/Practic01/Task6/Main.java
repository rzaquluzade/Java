package Practic01.Task6;

public class Main {

    public static void main(String[] args) {

        Storage <Integer> storage = new Storage<>();

        storage.add(5);
        storage.add(10);
        storage.add(15);

        storage.getAll();
    }
}
