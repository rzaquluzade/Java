package Practic01.Task4;

public class Pair <T, U> {

    private T name;
    private U age;

    public Pair(T name, U age) {
        this.name = name;
        this.age = age;
    }

    public T getName() {
        return name;
    }

    public U getAge() {
        return age;
    }
}
