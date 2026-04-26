package L10.abstraction.polymorphism.Task04EasyAbstractShape;

public class Rectangle extends Shape {

    double width;
    double height;

    public Rectangle (double width, double height) {
        super("Rectangle");
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }

}
