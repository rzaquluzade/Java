package L07.oop.fundamental.Task02EasyRectangleModel;

public class Rectangle {

    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double area() {
        return width * height;
    }

    public double perimeter() {
        return (width + height) * 2;
    }
}
