package L10.abstraction.polymorphism.Task04EasyAbstractShape;

public class Circle extends Shape {

    double radius;

    public Circle (double radius) {
        super("Circle");
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

}
