package Practic01.Task1;

public class GenericBox<T> {

    private T name;

    public T getType() {
        return name;
    }

    public void setType(T type) {
        this.name = type;
    }

    @Override
    public String toString() {
        return "Name : " + name;
    }
}
