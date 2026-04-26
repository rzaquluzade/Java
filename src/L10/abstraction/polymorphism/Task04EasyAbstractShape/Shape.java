package L10.abstraction.polymorphism.Task04EasyAbstractShape;

public abstract class Shape {

    String name;

    public Shape (String name) {
        this.name = name;
    }

    public abstract double area ();

    public void printName () {
        System.out.println("Shape name : " + name);
    }
}
